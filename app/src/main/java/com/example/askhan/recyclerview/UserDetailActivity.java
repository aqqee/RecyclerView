package com.example.askhan.recyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.askhan.recyclerview.models.Users;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class UserDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_detail);
        int imageID = getIntent().getIntExtra("image",0);
        String username = getIntent().getStringExtra("username");
        String mobile = getIntent().getStringExtra("mobile");
        String email = getIntent().getStringExtra("email");


        ImageView imageView = findViewById(R.id.ivDetail);
        TextView tV1 = findViewById(R.id.tv1);
        TextView tV2 = findViewById(R.id.tv2);
        TextView tV3 = findViewById(R.id.tv3);


        imageView.setImageResource(imageID);
        tV1.setText(username);
        tV2.setText(mobile);
        tV3.setText(email);

    }
}
