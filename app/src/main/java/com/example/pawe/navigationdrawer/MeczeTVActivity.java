package com.example.pawe.navigationdrawer;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MeczeTVActivity extends AppCompatActivity {

    int position = 0;
    ImageView hostImage, guestImage;
    TextView hostName, guestName;
    TextView posiadanie, strzaly, strzalyCelne, faule, spalone;
    Random r,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meczetv_activity);

      //  getActionBar().setTitle("New");

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * 0.8), (int) (height * 0.8));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            position = extras.getInt("counter");
        }
        System.out.println(position + "lololo");
        MeczeTVFragment wf = new MeczeTVFragment();
        List<MeczeTVItem> list = wf.getScores();

        MeczeTVItem wynikiItem = list.get(position);

        String[] kraj = {
                " TVP1 ", " Polsat ", " TVP Sport ",
                " CANAL+ Sport ", " Eurosport 1 ", " nSport+ ",
                " Eurosport 2 ", " Polsat Sport News ", " Polsat Sport ",
                " CANAL+ Sport2 ", " ESPN ", " TVP1 "
        };

        String[] miasto = {
                " poniedziałek ", " wtorek ", " środa ",
                " czwartek ", " piątek ", " sobota ",
                " poniedziałek ", " wtorek ", " środa ",
                " czwartek ", " piątek ", " sobota "
        };

        String[] stadion = {
                " M. Iwański ", " T. Jasina ", " J. Jońca ",
                " W. Lubański ", " M. Kołodziejczyk ", " D. Szpakowski ",
                " M. Iwański ", " T. Jasina ", " J. Jońca ",
                " W. Lubański ", " M. Kołodziejczyk ", " D. Szpakowski "
        };


        hostImage = (ImageView) findViewById(R.id.wynikiStatsHostImageView);
        guestImage = (ImageView) findViewById(R.id.wynikiStatsGuestImageView);
        hostName = (TextView) findViewById(R.id.wynikiStatsHostName);
        guestName = (TextView) findViewById(R.id.wynikiStatsGuestName);




        hostImage.setImageResource(wynikiItem.hostImage);
        guestImage.setImageResource(wynikiItem.guestImage);
        hostName.setText(wynikiItem.host);
        guestName.setText(wynikiItem.guest);


        posiadanie = (TextView) findViewById(R.id.data);
        strzaly = (TextView) findViewById(R.id.godzina);
        strzalyCelne = (TextView) findViewById(R.id.kraj);
        faule = (TextView) findViewById(R.id.miasto);
        spalone = (TextView) findViewById(R.id.stadion);


        r = new Random();
        r2 = new Random();
        int y = r2.nextInt(11);
        int x = r.nextInt(100);
        posiadanie.setText("MECZEtv: "+ r.nextInt(30)+"-01-2017");
        strzaly.setText("GODZINA: "+ r.nextInt(23) +":" + r.nextInt(60));
        strzalyCelne.setText(kraj[y]);
        faule.setText(miasto[y]);
        spalone.setText(stadion[y]);

    }
}
