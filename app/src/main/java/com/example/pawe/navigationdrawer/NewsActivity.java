package com.example.pawe.navigationdrawer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

/**
 * Created by Kamil_2 on 2016-12-28.
 */

public class NewsActivity extends AppCompatActivity{

    int position = 0;
    ImageView newsImage;
    TextView newsName, newsDate;
    TextView description;
    Random r,r2;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_activity);

        //  getActionBar().setTitle("New");

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
        NewsFragment wf = new NewsFragment();
        List<NewsItem> list = wf.getScores();

        NewsItem newsItem = list.get(position);

        String[] desc = {
                "Łukasz Teodorczyk z przytupem zakończył bardzo udany rok, bo w poniedziałek poprowadził Anderlecht do zwycięstwa z Charleroi (2:0). 25-letni Polak najpierw zdobył bramkę, która dała Fiołkom prowadzenie 1:0, a potem zaliczył asystę przy golu Franka Acheamponga.- Mieliśmy \"jaja\", by zaatakować Anderlecht wysokim pressingiem. Wystarczyło tylko odciąć Teodorczyka od podań, ale jeśli on ma choć jedną sytuację, to ją wykorzysta. To wielki napastnik. Tak naprawdę nie przegraliśmy z Anderlechtem - przegraliśmy z Teodorczykiem - stwierdził trener Charleroi, Felice Mazzu.",
                "W trwającej dekadzie, począwszy od stycznia 2011 roku, kluby, które dziś występują w Lotto Ekstraklasie, sprzedały za granicę tylko 65 zawodników, zarabiając na tym ok. 75 mln euro. \"Tylko\", ponieważ pod uwagę bierzemy aż 12 okien transferowych, co oznacza, że co pół roku zagraniczne kluby kupują w Polsce raptem pięciu zawodników.\n" +
                        "Lwia część tych wpływów pochodzi z transakcji przeprowadzonych w letnim oknie transferowym. W lipcu i sierpniu za gotówkę z Polski wyjechało ośmiu zawodników, na sprzedaży których kluby Lotto Ekstraklasy zarobiły ok. 18 mln euro. Pod tym względem było to rekordowe okno transferowe. Dla porównania, ze słowackiej ekstraklasy za gotówkę - łącznie 5,2 mln euro - odeszło latem tylko dwóch zawodników, a kluby czeskiej ekstraklasy wyeksportowały dziewięciu piłkarzy za 14,6 mln euro.",
                "Nigeryjczyk ma zastąpić Nemanję Nikolicia",
                "Były pomocnik Legii Warszawa zagra w Ruchu Chorzów? ",
                "Inter Mediolan zamierza sprowadzić Grzegorza Krychowiaka",
                "Claudio Ranieri otrzyma pieniądze na transfery",
                "FC Barcelona i Manchester City powalczą o niemiecki talent",
                "Manchester United może stracić swoją gwiazdę",
                "Artur Jędrzejczyk nie pomoże Legii Warszawa w Lidze Europy",
                "Dwóch piłkarzy Lecha Poznań czeka na wypożyczenia",
                " Glik \"pozamiatał\" swoim wpisem"
        };


        newsImage = (ImageView) findViewById(R.id.newsimg);
        newsName = (TextView) findViewById(R.id.newstitle);
        newsDate = (TextView) findViewById(R.id.newsDate);
        description = (TextView) findViewById(R.id.newsdesc);

        newsImage.setImageResource(newsItem.newsImage);
        newsName.setText(newsItem.newsTitle);
        newsDate.setText(newsItem.newsDate);


        r = new Random();
        r2 = new Random();
        int y = r2.nextInt(11);
        int x = r.nextInt(100);
        description.setText(desc[i]);
        ++i;

    }
}