package com.example.blooddonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView my_imageView = (ImageView) findViewById(R.id.my_imageView2);
        my_imageView.setImageResource(R.drawable.blood_donate);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {//This creates menu and returns Boolean value. onCreateOptionsMenu() to specify the options menu for an activity. Inflate means reading a layout XML (often given as parameter) to translate them in Java code
        MenuInflater menuInflater = getMenuInflater();//This class is used to instantiate menu XML files into Menu objects.
        menuInflater.inflate(R.menu.menu_xml, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case (R.id.donor):
                Intent i  = new Intent(getApplicationContext(),details_ofdonor.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "Donor Module", Toast.LENGTH_LONG).show();
                return true;
            case (R.id.reciever):
                Intent n = new Intent(getApplicationContext(),details_of_receiver.class);
                startActivity(n);
                Toast.makeText(MainActivity.this, "Reciever Module", Toast.LENGTH_LONG).show();
                return true;
            case (R.id.stock):
                Intent s = new Intent(getApplicationContext(),MainActivity1.class);
                startActivity(s);
                Toast.makeText(MainActivity.this, "Stock Management Module", Toast.LENGTH_LONG).show();
                return true;
            case (R.id.remainder):
                Intent r = new Intent(getApplicationContext(),Remainder.class);
                startActivity(r);
                Toast.makeText(MainActivity.this, "Remainder Module", Toast.LENGTH_LONG).show();
                return true;
            case (R.id.logout):
                Intent l = new Intent(getApplicationContext(),SignIn.class);
                startActivity(l);
                Toast.makeText(MainActivity.this, "LogOut Module", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}