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

public class Main2Activity extends AppCompatActivity  {

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
        setContentView(R.layout.activity_main2);
        Nextbtn = (Button) findViewById(R.id.nextbtn);
        RadioGroup answering = (RadioGroup) findViewById(R.id.answer);
        final RadioButton yes = (RadioButton) findViewById(R.id.AnswerYes);
        final RadioButton no = (RadioButton) findViewById(R.id.AnswerNo);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);


        Nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(yes.isChecked()){
                    Intent in= new Intent(Main2Activity.this,Main3Activity.class);
                    hasky.count++;
                    labrador.count++;
                    bokser.count++;
                    pitbul.count++;
                    in.putExtra("HaskyCount",hasky.count);
                    in.putExtra("LabradorCount",labrador.count);
                    in.putExtra("BokserCount",bokser.count);
                    in.putExtra("PitbulCount",pitbul.count);
                    startActivity(in);


                }

                else if (no.isChecked()){
                    Intent inte = new Intent(Main2Activity.this,Main3Activity.class);
                    mops.count++;
                    taksa.count++;
                    terier.count++;
                    inte.putExtra("MopsCount",mops.count);
                    inte.putExtra("TaksaCount",taksa.count);
                    inte.putExtra("TerierCount",terier.count);
                    startActivity(inte);
                }
            }


        });
    }

}





