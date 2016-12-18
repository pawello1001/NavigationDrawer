package com.example.pawe.navigationdrawer;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WynikiStatsActivity extends AppCompatActivity {

    int position = 0;
    ImageView hostImage, guestImage;
    TextView hostName, guestName, hostScore, guestScore;
    TextView posiadanie, strzaly, strzalyCelne, faule, spalone, zolteKartki, czerwoneKartki;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wyniki_stats);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * 0.8), (int) (height * 0.8));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            position = extras.getInt("counter");
        }
        WynikiFragment wf = new WynikiFragment();
        List<WynikiItem> list = wf.getScores();

        WynikiItem wynikiItem = list.get(position);

        hostImage = (ImageView) findViewById(R.id.wynikiStatsHostImageView);
        guestImage = (ImageView) findViewById(R.id.wynikiStatsGuestImageView);
        hostName = (TextView) findViewById(R.id.wynikiStatsHostName);
        guestName = (TextView) findViewById(R.id.wynikiStatsGuestName);
        hostScore = (TextView) findViewById(R.id.wynikiStatsHostScore);
        guestScore = (TextView) findViewById(R.id.wynikiStatsGuestScore);

        int host = Integer.parseInt(wynikiItem.hostScore);
        int guest = Integer.parseInt(wynikiItem.guestScore);
        if(host > guest) {
            hostScore.setTextColor(Color.GREEN);
            guestScore.setTextColor(Color.RED);
        }
        else if(host < guest){
            hostScore.setTextColor(Color.RED);
            guestScore.setTextColor(Color.GREEN);
        }
        else {
            hostScore.setTextColor(Color.BLUE);
            guestScore.setTextColor(Color.BLUE);
        }

        hostImage.setImageResource(wynikiItem.hostImage);
        guestImage.setImageResource(wynikiItem.guestImage);
        hostName.setText(wynikiItem.host);
        guestName.setText(wynikiItem.guest);
        hostScore.setText(wynikiItem.hostScore);
        guestScore.setText(wynikiItem.guestScore);

        posiadanie = (TextView) findViewById(R.id.wynikiStatsPosiadanie);
        strzaly = (TextView) findViewById(R.id.wynikiStatsStrzaly);
        strzalyCelne = (TextView) findViewById(R.id.wynikiStatsStrzalyCelne);
        faule = (TextView) findViewById(R.id.wynikiStatsFaule);
        spalone = (TextView) findViewById(R.id.wynikiStatsSpalone);
        zolteKartki = (TextView) findViewById(R.id.wynikiStatsZolteKartki);
        czerwoneKartki = (TextView) findViewById(R.id.wynikiStatsCzerwoneKartki);

        r = new Random();
        int x = r.nextInt(100);
        posiadanie.setText(x + "%   POSIADANIE   " + (100 - x) + "%");
        strzaly.setText(r.nextInt(10) + "   STRZAŁY   " + r.nextInt(10));
        strzalyCelne.setText(r.nextInt(5) + "   STRZAŁY CELNE   " + r.nextInt(5));
        faule.setText(r.nextInt(10) + "   FAULE   " + r.nextInt(10));
        spalone.setText(r.nextInt(7) + "   SPALONE   " + r.nextInt(7));
        zolteKartki.setText(r.nextInt(4) + "   ŻÓŁTE KARTKI   " + r.nextInt(4));
        czerwoneKartki.setText(r.nextInt(2) + "   CZERWONE KARTKI   " +r.nextInt(2));

        hostImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(12);
                finish();
            }
        });

        guestImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(12);
                finish();
            }
        });
    }
}
