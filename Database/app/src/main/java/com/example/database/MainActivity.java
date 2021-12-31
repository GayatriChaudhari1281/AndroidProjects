package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void InsertButton(View v)
    {
        Intent i = new Intent(getApplicationContext(), InsertPage.class);
        startActivity(i);
    }
    public void ListButton(View v)
    {
        Intent i = new Intent(getApplicationContext(), ListPage.class);
        startActivity(i);
    }
    public void UpdateButton(View v)
    {
        Intent i = new Intent(getApplicationContext(), UpdatePage.class);
        startActivity(i);
    }
    public void FindButton(View v)
    {
        Intent i = new Intent(getApplicationContext(), FIndPage.class);
        startActivity(i);
    }
    public void DeleteButton(View v)
    {
        Intent i = new Intent(getApplicationContext(), DeletePage.class);
        startActivity(i);
    }
}