package com.developerom.chatgloballllllly;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.developerom.chatgloballllllly.databinding.ActivityGroupChatBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GroupChatActivity extends AppCompatActivity {

    ActivityGroupChatBinding binding;
    FirebaseDatabase database;
    ArrayList<Message> messages;
    GroupChatAdapter adapter;
    FirebaseUser fUser;
    FirebaseAuth auth;
    String receiverUid;
    String URL="https://fcm.googleapis.com/fcm/send";
    RequestQueue requestQueue;
    FirebaseStorage storage;
    ProgressDialog dialog;
    String senderUid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGroupChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        String senderId = FirebaseAuth.getInstance().getUid();
        database = FirebaseDatabase.getInstance();
        storage = FirebaseStorage.getInstance();
        auth = FirebaseAuth.getInstance();
        dialog = new ProgressDialog(this);
        dialog.setMessage("Uploading image...");
        dialog.setCancelable(false);
        fUser = FirebaseAuth.getInstance().getCurrentUser();
        senderUid = auth.getUid();
        messages = new ArrayList<>();
        adapter = new GroupChatAdapter(messages,this);
        binding.recyclerView.setAdapter(adapter);
        receiverUid = getIntent().getStringExtra("uid");
        requestQueue = Volley.newRequestQueue(this);



        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);

        database.getReference().child("Group Chat").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                messages.clear();
                for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                    Message message = dataSnapshot.getValue(Message.class);
                    message.setMessageId(dataSnapshot.getKey());
                    messages.add(message);
                }
                adapter.notifyDataSetChanged();

                binding.recyclerView.smoothScrollToPosition(binding.recyclerView.getAdapter().getItemCount());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        binding.sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = binding.msgBox.getText().toString();
                try {
                    database.getReference().child("Group Chat").child(fUser.getUid()).addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            User userName = snapshot.getValue(User.class);
                            JSONObject jsonObject = new JSONObject();
                            try {
                                int position = 0;
                                Message message = messages.get(position);
                                assert message != null;
                                jsonObject.put("to","/topics/"+message.getMessageId());
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            JSONObject jsonObject1 = new JSONObject();
                            try {

                                if (userName != null) {
                                    jsonObject1.put("title","Global Group Chat: "+userName.getName());
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            try {
                                jsonObject1.put("body",msg);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            try {
                                jsonObject.put("notification",jsonObject1);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST,URL, jsonObject, new Response.Listener<JSONObject>() {
                                @Override
                                public void onResponse(JSONObject response) {

                                }
                            }, new Response.ErrorListener() {
                                @Override
                                public void onErrorResponse(VolleyError error) {

                                }
                            }){
                                @Override
                                public Map<String, String> getHeaders() throws AuthFailureError {
                                    Map<String,String> map = new HashMap<>();
                                    map.put("content-type","application/json");
                                    map.put("authorization","key=AAAA7RWWVcs:APA91bHgSOFqI09fo1q-Bts2wRvp6JKm-fr50sWKNctfbSOh0_Gj-nbqxFqPjnoX4PzdvPmE7BG_h9nNquUIy-oH7nULDnG3yWigReboY17rzNVKt3t7lnIxA0d0S0je5rSugNOGrucz");
                                    return map;
                                }
                            };
                            requestQueue.add(request);
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });


                } catch (Exception e) {
                    e.printStackTrace();
                }
                Date date = new Date();
                final Message message = new Message(msg,senderId,  date.getTime());
                binding.msgBox.setText("");

                database.getReference().child("Group Chat").push().setValue(message).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {

                    }
                });

            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(GroupChatActivity.this,MainActivity.class);
        startActivity(intent);
    }
}