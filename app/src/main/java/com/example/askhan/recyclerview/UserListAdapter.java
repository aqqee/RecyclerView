package com.example.askhan.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.askhan.recyclerview.models.Users;

import java.util.ArrayList;

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.UserViewHolder> {

    private Context mContext;
    ArrayList<Users> data;

    public UserListAdapter(Context mContext, ArrayList<Users> data)
    {
        this.mContext = mContext;
        this.data = data;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.single_user_view, null);
        UserViewHolder viewHolder = new UserViewHolder(view);
        return viewHolder;
    }

        @Override
        public void onBindViewHolder(UserViewHolder viewHolder, final int i) {
            UserViewHolder holder = (UserViewHolder) viewHolder;


            Users dataModel = data.get(i);

            holder.ivProfile.setImageResource(data.get(i).imageResourceId);
            holder.tvName.setText(data.get(i).userName);
            holder.tvMobile.setText(data.get(i).userMobile);
            holder.tvEmail.setText(data.get(i).userEmail);

            holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Toast.makeText(mContext,"Click"+i,Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(mContext,UserDetailActivity.class);
                    intent.putExtra("image",data.get(i).imageResourceId);
                    intent.putExtra("username",data.get(i).userName);
                    intent.putExtra("mobile",data.get(i).userMobile);
                    intent.putExtra("email",data.get(i).userEmail);
                    mContext.startActivity(intent);

                }
            });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder{
        private ImageView       ivProfile;
        private TextView        tvName;
        private TextView        tvMobile;
        private TextView        tvEmail;
        private RelativeLayout  relativeLayout;


        public UserViewHolder(View itemView) {
            super(itemView);
            relativeLayout =            itemView.findViewById(R.id.singleitem);
            ivProfile =     (ImageView) itemView.findViewById(R.id.ivProfile);
            tvName =        (TextView)  itemView.findViewById(R.id.tvName);
            tvMobile =      (TextView)  itemView.findViewById(R.id.tvMobile);
            tvEmail =       (TextView)  itemView.findViewById(R.id.tvEmail);
        }
    }
}
