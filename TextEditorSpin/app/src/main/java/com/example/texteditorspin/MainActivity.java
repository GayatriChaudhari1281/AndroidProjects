package com.example.texteditorspin;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.editTextTextPersonName);
        Spinner sp1=findViewById(R.id.spinner);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 1:tv.setTextColor(Color.RED); break;
                    case 2:tv.setTextColor(Color.YELLOW); break;
                    case 3:tv.setTextColor(Color.GREEN);break;
                    case 4:tv.setTextColor(Color.BLUE);break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        Spinner sp2=findViewById(R.id.spinner2);
        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 1:tv.setTextSize(25); break;
                    case 2:tv.setTextSize(35); break;
                    case 3:tv.setTextSize(45);;break;
                    case 4:tv.setTextSize(55);;break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        Spinner sp3=findViewById(R.id.spinner3);
        sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 1:tv.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));break;
                    case 2:tv.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD)); break;
                    case 3:tv.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void clearButton(View v)
    {
        String stringText=tv.getText().toString();
        tv.setText(stringText);
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(18);
        tv.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
    }
}