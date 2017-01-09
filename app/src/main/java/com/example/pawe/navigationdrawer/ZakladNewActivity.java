package com.example.pawe.navigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
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
                " Bayern ", " Everton FC ", " Tottenham FC ",
                " Chelsea ", " PSG ", " Leicester ",
                " Inter Med. ", " Man United ", " Man City ",
                " AC Milan ", " Juventus ", " SSC Napoli ",
                " Roma FC ", " FC Monaco ", " Bordeaux ",
                " Sevilla FC ", " Liverpool FC "
        };


        String[] score = {" 0 ",
                " 1 ", " 2 ", " 3 ",
                " 4 ", " 5 ", " 6 ",
                " 7 ", " 8 ", " 9 ",
                " 10 ", " 11 ", " 12 ",
        };


        hostName = (TextView) findViewById(R.id.textView);
        guestName = (TextView) findViewById(R.id.textView2);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);
        Button button1 = (Button) findViewById(R.id.button11);
        Button button2 = (Button) findViewById(R.id.button22);

        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {

                finish();
            }

        });

        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {

                finish();
            }

        });

        List<String> druzyna1 = new ArrayList<String>();

        List<String> wynik = new ArrayList<String>();

        int i=0;

        for(String e:clubs)
        {
            druzyna1.add(clubs[i]);

             ++i;
        }

        int j=0;

        for(String e:score)
        {
            wynik.add(score[j]);

            j++;
        }

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, druzyna1);

        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, wynik);


        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinner.setAdapter(dataAdapter);

        spinner2.setAdapter(dataAdapter);

        spinner3.setAdapter(dataAdapter2);

        spinner4.setAdapter(dataAdapter2);
        

    }
}
