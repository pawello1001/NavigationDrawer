package com.example.pawe.navigationdrawer;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ZakladNewActivity extends AppCompatActivity {

    int position = 0;

    TextView hostName, guestName;

    Random r,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zaklad_new_activity);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width), (int) (height));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            position = extras.getInt("counter");
        }
        System.out.println(position + "lololo");
        ZakladyFragment wf = new ZakladyFragment();
      //  List<ZakladyItem> list = wf.getScores();

     //   ZakladyItem wynikiItem = list.get(position);

        String[] clubs = {
                " Barcelona ", " Real Madrid ", " Arsenal FC ",
                " Bayern Munich ", " Everton FC ", " Tottenham FC ",
                " Chelsea FC ", " PSG ", " Leicester FC ",
                " Inter Mediolan ", " Man United ", " Man City ",
                " AC Milan ", " Juventus Turyn ", " SSC Napoli ",
                " Roma FC ", " FC Monaco ", " Bordeaux FC ",
                " Sevilla FC ", " Liverpool FC "
        };



        hostName = (TextView) findViewById(R.id.textView);
        guestName = (TextView) findViewById(R.id.textView2);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);

        List<String> druzyna1 = new ArrayList<String>();

        int i=0;

        for(String e:clubs)
        {
            druzyna1.add(clubs[i]);

             ++i;
        }

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, druzyna1);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        spinner2.setAdapter(dataAdapter);
        

    }
}
