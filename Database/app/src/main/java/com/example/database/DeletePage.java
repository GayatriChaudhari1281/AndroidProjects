package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DeletePage extends AppCompatActivity {
    private DBHandler dbHandler;
    EditText roll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_page);
        roll=findViewById(R.id.drn);
    }
    public void DeleteBtn(View v)
    {
        dbHandler = new DBHandler(DeletePage.this);
        String flag=dbHandler.deleteData(roll.getText().toString());
        if(flag.compareTo("-1")==0)
        {
            Toast.makeText(DeletePage.this, "Please enter valid Roll Number!!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(DeletePage.this, "Data Deleted Successfully!!!", Toast.LENGTH_SHORT).show();
        }
    }
    public void HomeBtn(View v)
    {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}