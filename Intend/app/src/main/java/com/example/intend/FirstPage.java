package com.example.intend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
    }
    public void firstExplicitButton(View v)
    {
        EditText person=findViewById(R.id.editTextTextPersonName);
        Intent i = new Intent(getApplicationContext(), secondpage.class);
        String name=person.getText().toString();
        i.putExtra("Value1",name);
        startActivity(i);
    }
}