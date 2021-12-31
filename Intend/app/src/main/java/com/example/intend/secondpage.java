package com.example.intend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class secondpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);

        TextView textView=findViewById(R.id.textView);
        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("Value1");
        textView.setText(value1);
    }
    public void HomeButton(View v)
    {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}