package com.example.recyclerview_animation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder>{
    private List<User> mlistUser;
    public void setData(List<User> list){
        this.mlistUser = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
       return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        User user = mlistUser.get(position);
        holder.HinhAnh.setImageResource(user.getResourceId());
        holder.TenUser.setText(user.getName());

    }

    @Override
    public int getItemCount() {
        return mlistUser.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView HinhAnh;
        private TextView TenUser;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            HinhAnh = itemView.findViewById(R.id.id_circle_imageView);
            TenUser = itemView.findViewById(R.id.id_tv_ten);
        }
    }
}
