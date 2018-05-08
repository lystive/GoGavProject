package com.iomis.gogavproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView text = (TextView) findViewById(R.id.txtt);
        Intent intent = getIntent();
        int count = intent.getIntExtra("1PitbulCount",0);
        text.setText("Pitbul is "+ count);
    }
}
