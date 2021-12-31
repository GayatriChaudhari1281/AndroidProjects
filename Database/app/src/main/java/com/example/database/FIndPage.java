package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FIndPage extends AppCompatActivity {

    private DBHandler dbHandler;
    TextView rn,name,address,marks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_page);
        rn=findViewById(R.id.frn);
        name=findViewById(R.id.fname);
        address=findViewById(R.id.faddress);
        marks=findViewById(R.id.fmarks);
    }
    public void Findbtn(View v)
    {
        EditText roll=findViewById(R.id.rn);
        Student data;
        dbHandler = new DBHandler(FIndPage.this);
        data=dbHandler.find(roll.getText().toString());
        if(data==null)
        {
            Toast.makeText(FIndPage.this, "Please enter valid Roll Number!!", Toast.LENGTH_SHORT).show();
            rn.setText("");
            name.setText("");
            address.setText("");
            marks.setText("");
        }
        else
        {
            rn.setText(data.getRollNo().toString());
            name.setText(data.getName().toString());
            address.setText(data.getAddress().toString());
            marks.setText(data.getMarks().toString());
        }
    }
    public void HomeBtn(View v)
    {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}