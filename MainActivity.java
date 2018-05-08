package com.iomis.gogavproject;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.media.audiofx.Equalizer;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button PlayButton,SettingsButton,VolumeButton;
    private Button buttonStart;
    private Button buttonStop;
    private Button factsButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PlayButton = (Button) findViewById(R.id.PlayButton);
        PlayButton.setOnClickListener(this);
        SettingsButton = (Button) findViewById(R.id.settingsButton);
        SettingsButton.setOnClickListener(this);

        buttonStop = (Button) findViewById(R.id.buttonStop);
        factsButton = (Button) findViewById(R.id.facts);
        factsButton.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        startService(new Intent(this,MyService.class));
        }



    @Override
    public void onClick (View v){

        switch(v.getId()) {
            case R.id.PlayButton :
Intent intent = new Intent(this,Main2Activity.class);
startActivity(intent);
                break;
            case R.id.settingsButton :
                Intent intent1 = new Intent(this,SettingsActivity.class);
                startActivity(intent1);
                break;
            case R.id.facts:
                Intent intent2 = new Intent(this,FactsActivity.class);
                startActivity(intent2);
                break;

            default:
                break;
        }
        if (v == buttonStop) {
            stopService(new Intent(this,MyService.class));
        }
    }




}
