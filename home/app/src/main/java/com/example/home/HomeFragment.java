package com.example.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class HomeFragment extends Fragment implements View.OnClickListener {
    AppCompatButton appCompatButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        appCompatButton = view.findViewById(R.id.appcompatbutton);
        appCompatButton.setOnClickListener(this);
        return view;
    }

    public void onclick_pl(View view) {
        Intent intent = new Intent(getActivity(),Add_Room.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {

    }

    public void onclick1(View view) {
    }
}