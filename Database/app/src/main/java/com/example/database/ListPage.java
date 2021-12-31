package com.example.database;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ListPage extends AppCompatActivity {

    private ArrayList<Student> studentArrayList;
    private DBHandler dbHandler;
    private StudentRvAdapter studentRvAdapter;
    private RecyclerView studentRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_page);

        studentArrayList = new ArrayList<>();
        dbHandler = new DBHandler(ListPage.this);

        // getting our student array
        // list from db handler class.
        studentArrayList = dbHandler.List();

        // on below line passing our array lost to our adapter class.
        studentRvAdapter = new StudentRvAdapter(studentArrayList, ListPage.this);
        studentRv = findViewById(R.id.idRVStudent);

        // setting layout manager for our recycler view.
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ListPage.this, RecyclerView.VERTICAL, false);
        studentRv.setLayoutManager(linearLayoutManager);

        // setting our adapter to recycler view.
        studentRv.setAdapter(studentRvAdapter);
    }

}