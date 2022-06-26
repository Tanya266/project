package com.example.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import Activity.AddRoom;
import Activity.AddRoomAdapter;

public class Add_Room extends AppCompatActivity {
    RecyclerView recyclerView;
    AddRoomAdapter adapter;
    List <AddRoom> rooms = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_room);
        recyclerView = findViewById(R.id.rv_room);

        adapter = new AddRoomAdapter(this, rooms);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        getAdd_Room();
    }

    private void getAdd_Room() {
        rooms.add(new AddRoom("dasd",R.drawable.kitchen));
        rooms.add(new AddRoom("dasd",R.drawable.kitchen));
        rooms.add(new AddRoom("dasd",R.drawable.kitchen));
    }

    public void onClickback(View view) {
        Intent intent = new Intent(Add_Room.this, HomeFragment.class);
        startActivity(intent);
    }
}