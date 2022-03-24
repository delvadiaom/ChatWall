package com.developerom.chatgloballllllly;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.developerom.chatgloballllllly.databinding.CustomLayoutBinding;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ImageViewHolder> {

    List<customItems> itemsList;
    Context context;

    public RecyclerViewAdapter(List<customItems> itemsList, Context context) {
        this.itemsList = itemsList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.custom_layout,parent,false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ImageViewHolder holder, int position) {

        Picasso.get().load(itemsList.get(position).getUrl()).into(holder.binding.img);

    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        CustomLayoutBinding binding;
        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            binding = CustomLayoutBinding.bind(itemView);
        }

        @Override
        public void onClick(View v) {

            Intent intent = new Intent(context, ViewActivity.class);
            intent.putExtra("images",itemsList.get(getAdapterPosition()).getUrl());
            context.startActivity(intent);
        }
    }
}
