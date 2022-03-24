package com.developerom.chatgloballllllly;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.developerom.chatgloballllllly.databinding.DeleteDialogGroupBinding;
import com.developerom.chatgloballllllly.databinding.ItemGroupreceiveBinding;
import com.developerom.chatgloballllllly.databinding.ItemGroupsentBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class GroupChatAdapter extends RecyclerView.Adapter {

    Context context;
    ArrayList<Message> messages;
    final int ITEM_SENT = 1;
    final int ITEM_RECEIVE = 2;

    public GroupChatAdapter(ArrayList<Message> messages, Context context){
        this.messages = messages;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == ITEM_SENT){
            View view = LayoutInflater.from(context).inflate(R.layout.item_groupsent,parent,false);
            return new GroupChatAdapter.SentViewHolder(view);
        }else {
            View view = LayoutInflater.from(context).inflate(R.layout.item_groupreceive,parent,false);
            return new GroupChatAdapter.ReceiveViewHolder(view);
        }
    }

    @Override
    public int getItemViewType(int position) {
        Message message = messages.get(position);
        if (FirebaseAuth.getInstance().getUid().equals(message.getSenderId())){
            return ITEM_SENT;
        }else {
            return ITEM_RECEIVE;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        final Message message = messages.get(position);

        if (holder.getClass() == GroupChatAdapter.SentViewHolder.class){
            SentViewHolder viewHolder = (SentViewHolder) holder;
            FirebaseDatabase.getInstance().getReference().child("Users").child(message.getSenderId()).addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (snapshot.exists()){
                        User user = snapshot.getValue(User.class);
                        viewHolder.binding.usermsg.setText(user.getName());
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });

            FirebaseDatabase database = FirebaseDatabase.getInstance();
            database.getReference().child("Group Chat").child(message.getMessageId()).addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (snapshot.exists()){
                        long time = snapshot.child("timestamp").getValue(Long.class);
                        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM/dd/yyyy,hh:mm a");
                        viewHolder.binding.msgTime.setText(dateFormat.format(new Date(time)));
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });


            viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    View view = LayoutInflater.from(context).inflate(R.layout.delete_dialog_group, null);
                    DeleteDialogGroupBinding binding = DeleteDialogGroupBinding.bind(view);
                    AlertDialog dialog = new AlertDialog.Builder(context)
                            .setTitle("Delete Message")
                            .setView(binding.getRoot())
                            .create();

                    binding.deletemessage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            FirebaseDatabase database = FirebaseDatabase.getInstance();
                            database.getReference().child("Group Chat").child(message.getMessageId()).setValue(null);
                            Toast.makeText(context, "Message is deleted", Toast.LENGTH_SHORT).show();
                            dialog.dismiss();
                        }
                    });

                    binding.cancel.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });

                    dialog.show();

                    return false;
                }
            });

            viewHolder.binding.message.setText(message.getMessage());
        }
        else {
            ReceiveViewHolder viewHolder = (ReceiveViewHolder) holder;
            FirebaseDatabase.getInstance().getReference().child("Users").child(message.getSenderId()).addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (snapshot.exists()){
                        User user = snapshot.getValue(User.class);
                        viewHolder.binding.usermsg.setText(user.getName());
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });

            FirebaseDatabase database = FirebaseDatabase.getInstance();
            database.getReference().child("Group Chat").child(message.getMessageId()).addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (snapshot.exists()){
                        long time = snapshot.child("timestamp").getValue(Long.class);
                        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM/dd/yyyy,hh:mm a");
                        viewHolder.binding.msgTime.setText(dateFormat.format(new Date(time)));
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });


            viewHolder.binding.message.setText(message.getMessage());
        }
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }

    public static class SentViewHolder extends RecyclerView.ViewHolder{

        ItemGroupsentBinding binding;

        public SentViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemGroupsentBinding.bind(itemView);
        }
    }

    public static class ReceiveViewHolder extends RecyclerView.ViewHolder{

        ItemGroupreceiveBinding binding;

        public ReceiveViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemGroupreceiveBinding.bind(itemView);
        }
    }
}
