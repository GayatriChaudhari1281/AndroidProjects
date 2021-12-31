package com.example.intend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void implictButton(View v)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW);

        intent.setData(Uri.parse("https://www.geeksforgeeks.org"));

        startActivity(intent);
    }
    public void exlicitButton(View v)
    {
        Intent i = new Intent(getApplicationContext(), FirstPage.class);
        i.putExtra("Value1", "Android By Javatpoint");
        i.putExtra("Value2", "Simple Tutorial");
        // Set the request code to any code you like, you can identify the
        // callback via this code
        startActivity(i);
    }
}