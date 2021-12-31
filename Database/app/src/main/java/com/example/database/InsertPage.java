package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InsertPage extends AppCompatActivity {

    EditText rollnumber,name,address,marks;
    private DBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_page);
        rollnumber=findViewById(R.id.irn);
        name=findViewById(R.id.iname);
        address=findViewById(R.id.iaddress);
        marks=findViewById(R.id.imarks);

    }
    public void InsertBtn(View v)
    {
        String rn=rollnumber.getText().toString();
        String Name=name.getText().toString();
        String addr=address.getText().toString();
        String mark=marks.getText().toString();
        dbHandler = new DBHandler(InsertPage.this);
        if ( rn.isEmpty() && Name.isEmpty() && addr.isEmpty() && mark.isEmpty()) {
            Toast.makeText(InsertPage.this, "Please enter all the data..", Toast.LENGTH_SHORT).show();
        }
        dbHandler.adddata(rn,Name,addr,mark);

        // after adding the data we are displaying a toast message.
        Toast.makeText(InsertPage.this, "Data has been added.", Toast.LENGTH_SHORT).show();
        rollnumber.setText("");
        name.setText("");
        address.setText("");
        marks.setText("");
    }
    public void HomeBtn(View v)
    {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }

}