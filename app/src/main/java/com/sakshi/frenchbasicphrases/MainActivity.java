package com.sakshi.frenchbasicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // MY METHOD
    /*
    MediaPlayer mp;

    public void phrases(View view)
    {
        Button b= (Button) findViewById(view.getId());
        String t = b.getTag().toString();
        Log.i("Tag", t);
        playAudio(t);
    }


    void playAudio(String t)
    {
        switch(t)
        {
            case "1":
                mp=MediaPlayer.create(this,R.raw.hello);
                break;
            case "2":
                mp=MediaPlayer.create(this,R.raw.howareyou);
                break;
            case "3":
                mp=MediaPlayer.create(this,R.raw.goodevening);
                break;
            case "4":
                mp=MediaPlayer.create(this,R.raw.mynameis);
                break;
            case "5":
                mp=MediaPlayer.create(this,R.raw.please);
                break;
            case "6":
                mp=MediaPlayer.create(this,R.raw.ilivein);
                break;
            case "7":
                mp=MediaPlayer.create(this,R.raw.doyouspeakenglish);
                break;
            case "8":
                mp=MediaPlayer.create(this,R.raw.welcome);
                break;
            default:
                //do nothing
        }
        mp.start();
    }

*/

    //Easier method

    public void phrases(View view)
    {
        int id = view.getId();
        String ourId ="";
        ourId= view.getResources().getResourceEntryName(id);

        int resourceId = getResources().getIdentifier(ourId, "raw", "com.sakshi.frenchbasicphrases");

        MediaPlayer mp = MediaPlayer.create(this, resourceId);
        mp.start();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}