package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UpdatePage extends AppCompatActivity {

    private DBHandler dbHandler;
    EditText searchrn,uname,uaddr,umarks;
    String Sroll,Sname,Saddr,Smarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_page);
    }

    public void HomeBtn(View v)
    {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
    public void searchbtn(View v)
    {
        searchrn=findViewById(R.id.uroll);
        Sroll=searchrn.getText().toString();
        uname=findViewById(R.id.uname);
        uaddr=findViewById(R.id.uaddr);
        umarks=findViewById(R.id.umarks);
        Student data;
        dbHandler = new DBHandler(UpdatePage.this);
        data=dbHandler.find(Sroll);
        if(data==null)
        {
            Toast.makeText(UpdatePage.this, "Roll Number not found!!", Toast.LENGTH_SHORT).show();
            uname.setText("");
            uaddr.setText("");
            umarks.setText("");
            searchrn.setText("");
        }
        else
        {
            searchrn.setText(data.getRollNo());
            uname.setText(data.getName());
            uaddr.setText(data.getAddress());
            umarks.setText(data.getMarks());
        }
    }
    public void updatebtn(View v)
    {
        Sroll=searchrn.getText().toString();
        Sname=uname.getText().toString();
        Saddr=uaddr.getText().toString();
        Smarks=umarks.getText().toString();
        dbHandler = new DBHandler(UpdatePage.this);
        if ( Sroll.isEmpty() && Sname.isEmpty() && Saddr.isEmpty() && Smarks.isEmpty()) {
            Toast.makeText(UpdatePage.this, "Please enter all the data..", Toast.LENGTH_SHORT).show();
        }
        dbHandler.updateStudent(Sroll,Sname,Saddr,Smarks);
        Toast.makeText(UpdatePage.this, "Data Updated successfully!!", Toast.LENGTH_SHORT).show();
        uname.setText("");
        uaddr.setText("");
        umarks.setText("");
        searchrn.setText("");
    }
}