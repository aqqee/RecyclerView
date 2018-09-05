package com.example.askhan.recyclerview;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.askhan.recyclerview.models.Users;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpToolbar();


        RecyclerView userlist = findViewById(R.id.contacts);
        userlist.setLayoutManager(new LinearLayoutManager(this));
        userlist.setItemAnimator( new DefaultItemAnimator());


        ArrayList<Users> UserList = new ArrayList<>();

        UserList.add(new Users(R.drawable.alfa,
                "Alfa", "+923031234567",
                "alfa@gmail.com"));
        UserList.add(new Users(R.drawable.bravo,
                "Bravo", "+923228776655",
                "bravo@gmail.com"));
        UserList.add(new Users(R.drawable.charlie,
                "Charlie", "+923419886655",
                "charlie@gmail.com"));
        UserList.add(new Users(R.drawable.delta,
                "Delta", "+923429887755",
                "delta@gmail.com"));
        UserList.add(new Users(R.drawable.echo,
                "Echo", "+92333776655",
                "echo@gmail.com"));
        UserList.add(new Users(R.drawable.foxtrot,
                "Foxtrot", "+924556655",
                "foxtrot@gmail.com"));
        UserList.add(new Users(R.drawable.golf,
                "Golf", "+923248776655",
                "golf@gmail.com"));
        UserList.add(new Users(R.drawable.hotel,
                "Hotel", "+923129776655",
                "hotel@gmail.com"));
        UserList.add(new Users(R.drawable.india,
                "India", "+923138776655",
                "india@gmail.com"));
        UserList.add(new Users(R.drawable.juliett,
                "Juliett", "+923338776655",
                "juliett@gmail.com"));
        UserList.add(new Users(R.drawable.foxtrot,
                "Foxtrot", "+924556655",
                "foxtrot@gmail.com"));
        UserList.add(new Users(R.drawable.golf,
                "Golf", "+923248776655",
                "golf@gmail.com"));
        UserList.add(new Users(R.drawable.hotel,
                "Hotel", "+923129776655",
                "hotel@gmail.com"));
        UserList.add(new Users(R.drawable.india,
                "India", "+923138776655",
                "india@gmail.com"));
        UserList.add(new Users(R.drawable.juliett,
                "Juliett", "+923338776655",
                "juliett@gmail.com"));

        UserList.add(new Users(R.drawable.foxtrot,
                "Foxtrot", "+924556655",
                "foxtrot@gmail.com"));
        UserList.add(new Users(R.drawable.golf,
                "Golf", "+923248776655",
                "golf@gmail.com"));
        UserList.add(new Users(R.drawable.hotel,
                "Hotel", "+923129776655",
                "hotel@gmail.com"));
        UserList.add(new Users(R.drawable.india,
                "India", "+923138776655",
                "india@gmail.com"));
        UserList.add(new Users(R.drawable.juliett,
                "Juliett", "+923338776655",
                "juliett@gmail.com"));

        UserListAdapter userListAdapter = new UserListAdapter(this, UserList);
        userlist.setAdapter(userListAdapter);
    }

    private void setUpToolbar(){
        drawerLayout = findViewById(R.id.drawerLayout);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.app_name,R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }
}
