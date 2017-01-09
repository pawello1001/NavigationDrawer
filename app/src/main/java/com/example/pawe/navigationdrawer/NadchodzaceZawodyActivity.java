package com.example.pawe.navigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

public class NadchodzaceZawodyActivity extends AppCompatActivity {

    int position = 0;
    ImageView hostImage, guestImage;
    TextView hostName, guestName, date;
    TextView posiadanie, strzaly, strzalyCelne, faule, spalone;
    Random r,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nadchodzace_zawody);

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

        String[] kraj = {
                " Indie ", " Meksyk ", " Hiszpania ",
                " Iran ", " Południowa Afryka ", " USA ",
                " Anglia ", " Indonezja ", " Malezja ",
                " Egipt ", " Hiszpania ", " Australia "
        };

        String[] miasto = {
                " Kolkata ", " Meksyk ", " Barcelona ",
                " Teheran ", " Johannesburg ", " Pasadena ",
                " Londyn ", " Dżakarta ", " Kuala Lumpur ",
                " Aleksandria ", " Madryt ", " Sydney "
        };

        String[] stadion = {
                " Salt Lake Stadium ", " Estadio Azteca ", " Camp Nou ",
                " Stadion Azadi ", " FNB Stadium ", " Rose Bowl ",
                " Stadion Wembley ", " Gelora Bung Karno ", " Narodowy Bukit Jalil ",
                " Stadion Borg El Arab ", " Santiago Bernabéu", " ANZ Stadium "
        };


        hostImage = (ImageView) findViewById(R.id.wynikiStatsHostImageView);
        guestImage = (ImageView) findViewById(R.id.wynikiStatsGuestImageView);
        hostName = (TextView) findViewById(R.id.wynikiStatsHostName);
        guestName = (TextView) findViewById(R.id.wynikiStatsGuestName);
        date = (TextView) findViewById(R.id.nadchodzaceZawodyData);

        hostImage.setImageResource(wynikiItem.hostImage);
        guestImage.setImageResource(wynikiItem.guestImage);
        hostName.setText(wynikiItem.host);
        guestName.setText(wynikiItem.guest);

        Button butts = (Button) findViewById(R.id.button44);

        butts.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {

                finish();
            }

        });

        posiadanie = (TextView) findViewById(R.id.data);
        strzaly = (TextView) findViewById(R.id.godzina);
        strzalyCelne = (TextView) findViewById(R.id.kraj);
        faule = (TextView) findViewById(R.id.miasto);
        spalone = (TextView) findViewById(R.id.stadion);

        r = new Random();
        r2 = new Random();
        int y = r2.nextInt(11);
        int x = r.nextInt(100);
        posiadanie.setText("DATA: "+ r.nextInt(30)+"-01-2017");
        strzaly.setText("GODZINA: "+ r.nextInt(23) +":" + r.nextInt(60));
        strzalyCelne.setText(kraj[y]);
        faule.setText(miasto[y]);
        spalone.setText(stadion[y]);

    }
}
