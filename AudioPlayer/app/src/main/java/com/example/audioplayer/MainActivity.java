package com.example.audioplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer music;
    private int forwardTime = 5000;
    private int backwardTime = 5000;
    private int CurrentPosition=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        music = MediaPlayer.create(this, R.raw.tera_yaar);
    }
    public void musicstart(View v)
    {
        music.start();
    }
    public void musicpause(View v)
    {
        music.pause();
    }
    public void musicstop(View v)
    {
        music.stop();
        music = MediaPlayer.create(this, R.raw.tera_yaar);
    }
    public void forwardbutton(View view)
    {
        CurrentPosition=music.getCurrentPosition();
        if ((forwardTime + CurrentPosition) <= music.getDuration())
        {
            music.seekTo(CurrentPosition + forwardTime);
        }
        else
        {
            music.start();
        }
    }
    public void previousbutton(View view) {
        CurrentPosition = music.getCurrentPosition();
        if ((CurrentPosition - backwardTime) >= 0) {
            music.seekTo(CurrentPosition - backwardTime);
        } else {
            music.start();
        }
    }
}