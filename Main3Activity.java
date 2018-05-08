package com.iomis.gogavproject;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.app.Activity;
import android.view.View;
import android.widget.*;
import android.graphics.drawable.GradientDrawable;

public class Main3Activity extends AppCompatActivity  {

    Button Nextbtn;
    RadioGroup answering;
    RadioButton Yes, No;
    Dogs hasky = new Dogs();
    Dogs mops = new Dogs();
    Dogs labrador = new Dogs();
    Dogs taksa = new Dogs();
    Dogs bokser = new Dogs();
    Dogs pitbul = new Dogs();
    Dogs terier = new Dogs();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Nextbtn = (Button) findViewById(R.id.nextbtn);
        RadioGroup answering = (RadioGroup) findViewById(R.id.answer);
        final RadioButton yes = (RadioButton) findViewById(R.id.AnswerYes);
        final RadioButton no = (RadioButton) findViewById(R.id.AnswerNo);
        final RadioButton hz = (RadioButton) findViewById(R.id.AnswerHZ);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        Intent intent3=getIntent();
        hasky.count=intent3.getIntExtra("HaskyCount",0);
        mops.count=intent3.getIntExtra("MopsCount",0);
        taksa.count=intent3.getIntExtra("TaksaCount",0);
        labrador.count=intent3.getIntExtra("LabradorCount",0);
        pitbul.count=intent3.getIntExtra("PitbulCount",0);
        terier.count=intent3.getIntExtra("TerierCount",0);
        bokser.count=intent3.getIntExtra("BokserCount",0);



        Nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(yes.isChecked()){
                    Intent intent = new Intent(Main3Activity.this,Main4Activity.class);
                    bokser.count++;
                    pitbul.count++;
                    intent.putExtra("1BokserCount",bokser.count);
                    intent.putExtra("1PitbulCount",pitbul.count);
                    startActivity(intent);


                }

                else if (no.isChecked()){
                    Intent intent1 = new Intent(Main3Activity.this,Main4Activity.class);
                    bokser.count--;
                    pitbul.count--;
                    intent1.putExtra("1BokserCount",bokser.count);
                    intent1.putExtra("1PitbulCount",pitbul.count);
                    startActivity(intent1);
                }
                else if (hz.isChecked()){
                    Intent intent1 = new Intent(Main3Activity.this,Main4Activity.class);
                    startActivity(intent1);
                }
            }


        });
    }

}





