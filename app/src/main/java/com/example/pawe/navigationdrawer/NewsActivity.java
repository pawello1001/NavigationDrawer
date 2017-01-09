package com.example.pawe.navigationdrawer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
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
                        "Lwia część tych wpływów pochodzi z transakcji przeprowadzonych w letnim oknie transferowym. W lipcu i sierpniu za gotówkę z Polski wyjechało ośmiu zawodników, na sprzedaży których kluby Lotto Ekstraklasy zarobiły ok. 18 mln euro. Pod tym względem było to rekordowe okno transferowe.",
                "W pierwszym meczu III rundy el. Ligi Mistrzów 2013/2014 Legia zremisowała z ówczesnym mistrzem Norwegii 1:1, a gola dla niego strzelił właśnie Daniel Chima Chukwu.\n" +
                        "W 2015 roku Nigeryjczyk opuścił Molde na rzecz Shanghai Shenxin. W sezonie 2015 chińskiej ekstraklasy strzelił dziesięć goli i zaliczył osiem asyst w 27 występach, ale jego zespół spadł do II ligi. Na zapleczu Super League Chukwu radził sobie jeszcze lepiej, bo w 22 meczach zdobył 11 bramek.",
                "Po odjęciu przez Komisję Licencyjną PZPN czterech punktów sytuacja Ruchu Chorzów w tabeli Lotto Ekstraklasy zrobiła się trudna. Działacze klubu z Cichej są świadomi, że bez wzmocnień drużyna może mieć problemy z utrzymaniem.\n" +
                        "Klub prowadzi rozmowy z kilkoma zawodnikami, którzy mogliby znacząco wzmocnić zespół. Jednym z nich jest Stojan Vranjes. Pomocnik w grudniu rozwiązał umowę z Legią Warszawa, w której występował przez ostatnie półtora roku. Wcześniej w ekstraklasie bronił barw Lechii Gdańsk.",
                "Grzegorz Krychowiak jest na celowniku Interu już od kilku miesięcy, ale latem mediolańczycy nie mogli wygrać z PSG bitwy o pozyskanie Polaka z Sevilli. 26-latek chciał wrócić do Francji, w której występował już w latach 2006-2014. Do tego do Parku Książąt sprowadził go Unai Emery, czyli jego szkoleniowiec z Sevilli, co miało ułatwić mu wejście do drużyny.\n" +
                        "Tymczasem za Krychowiakiem rozczarowująca runda. Nie dość, że nie przebił się do \"11\" PSG, to jeszcze nie są mu przychylne francuskie media. \"L'Equipe\" na przykład wskazał go jako jeden z transferowych niewypałów. Reprezentant Polski zagrał w 16 z 27 spotkań PSG, ale od pierwszego gwizdka wystąpił tylko dziesięciokrotnie",
                "Choć latem Leicester City znacząco nie osłabiło swojej kadry, runda jesienna jest fatalna dla mistrza Anglii. Po 18 kolejkach Lisy zajmują dopiero 16. miejsce w tabeli Premier League.\n" +
                        "Premier League: Zaczęło się sensacyjnie, ale Liverpool rozbił Stoke i jest wiceliderem\n" +
                        "Wiosną drużynę czeka walka o utrzymanie w najwyższej klasie rozgrywkowej w Anglii i w klubie zdają sobie sprawę, że zespół potrzebuje wzmocnień. Dlatego też zimą w Leicester zamierzają wydać poważne pieniądze na transfery.\n" +
                        "Według \"Daily Telegraph\" Claudio Ranieri otrzyma 30 milionów funtów na nowych graczy. Na King Power Stadium ma trafić co najmniej trzech wysokiej klasy zawodników.",
                "Młody Niemiec zbiera znakomite recenzje za swoją grę. Pomocnik Borussii Dortmund jest bacznie obserwowany przez wiele europejskich klubów. Według dziennika \"AS\", najbardziej zainteresowane 21-letnim Julianem Weiglem są FC Barcelona oraz Manchester City.\n" +
                        "Philippe Coutinho zagra w FC Barcelona?\n" +
                        "Włodarze Dumy Katalonii uważają, że pomocnik miałby być następcą Sergio Busquetsa. Weigl znajduje się na samym szczycie listy potencjalnych wzmocnień, a raporty skautów Blaugrany na jego temat są naprawdę rewelacyjne. Na przeszkodzie Barcelonie może stanąć jednak Pep Guardiola, który dysponuje w Anglii większymi możliwościami finansowymi.",
                "- Rzeczywiście rozważamy opcję z Sevilli, a przecież rozmawiamy o wielkim klubie. Sevilla jest na dobrej pozycji w lidze hiszpańskiej i ma wspaniałego szkoleniowca. W tym momencie nie mogę powiedzieć nic więcej - przyznał Philippe Lamboley.\n" +
                        "Anthony Martial nie jest ulubieńcem Jose Mourinho. Francuz gra dużo słabiej niż w poprzednim sezonie, a na dodatek rozzłościła go decyzja zaraz po transferze Zlatana Ibrahimovicia. Martial bowiem stracił numer \"dziewięć\" na koszulce i nikt mu nawet nie powiedział, że tak się stanie.",
                "Legia wykupi Artura Jędrzejczyka z FK Krasnodar za ok. milion euro, a sprowadzenie go na Łazienkowską 3 będzie olbrzymim wzmocnieniem ekipy Jacka Magiery. W pierwszej połowie 2017 roku reprezentant kraju przyda się Legii jednak tylko w walce o obronę mistrzostwa Polski.\n" +
                        "W meczach 1/16 finału Ligi Europy z Ajaksem Amsterdam Jędrzejczyk nie będzie mógł zagrać, ponieważ wystąpił już w tych rozgrywkach w barwach FK Krasnodar.",
                "Legii Magiery też się takie wypadki zdarzają jak remis u siebie z Wisłą Płock, drużynę z Łazienkowskiej to jedynie nakręca do jeszcze bardziej wytężonej pracy, do jeszcze większej mobilizacji, do jeszcze większej koncentracji.\n" +
                        "Rozmawiałem z legionistami po tym remisie z Wisłą Płock i widziałem ludzi zirytowanych tym, że wyszli na frajerów wypuszczając dwubramkowe prowadzenie. Jakby im pozwolić, wskoczyliby raz jeszcze w krótkie spodenki i chcieli od razu grać rewanż. Żeby się natychmiast odegrać, żeby pokazać, że to był jedynie wypadek przy pracy.",
                "- Oni mają na tyle duży potencjał, że kiedyś mogą stanowić o sile Lecha i właśnie teraz trzeba im zapewnić odpowiedni rozwój. Wiadomo, że 17- czy 18-latek czasem nie jest w stanie wygrać rywalizacji ze starszym kolegą - przyznał w rozmowie z WP SportoweFakty prezes Kolejorza, Karol Klimczak.\n" +
                        "Dariusz Formella został wypożyczony do Arki Gdynia. Czy w przypadku pozostałej dwójki również są brane pod uwagę tylko drużyny z Lotto Ekstraklasy? - Chcemy im zapewnić kluby z niezłą infrastrukturą i trenerami, którzy potrafią pracować z młodzieżą. Wcale nie jest powiedziane, że zespoły, do których przeniosą się ci zawodnicy muszą być w ekstraklasie, albo się o nią bić. Nasi piłkarze mają po prostu zyskać możliwość podnoszenia swoich kwalifikacji - zaznaczył Klimczak."
        };


        newsImage = (ImageView) findViewById(R.id.newsimg);
        newsName = (TextView) findViewById(R.id.newstitle);
        newsDate = (TextView) findViewById(R.id.newsDate);
        description = (TextView) findViewById(R.id.newsdesc);

        newsImage.setImageResource(newsItem.newsImage);
        newsName.setText(newsItem.newsTitle);
        newsDate.setText(newsItem.newsDate);


        Button butt1 = (Button) findViewById(R.id.button33);

        butt1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {

                finish();
            }

        });


        r = new Random();
        r2 = new Random();
        int y = r2.nextInt(11);
        int x = r.nextInt(10);
        description.setText(desc[x]);
        ++i;

    }
}