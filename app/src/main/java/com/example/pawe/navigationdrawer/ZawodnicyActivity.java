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

public class ZawodnicyActivity extends AppCompatActivity{

    int position = 0;
    ImageView playerImage;
    TextView playerName, playerClub;
    TextView description;
    Random r,r2;
    static int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zawodnicy_activity);

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

        Button buuts = (Button) findViewById(R.id.button99);

        buuts.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {

                finish();
            }

        });

        System.out.println(position + "lololo");
        ZawodnicyFragment wf = new ZawodnicyFragment();
        List<ZawodnicyItem> list = wf.getScores();

        ZawodnicyItem zawodnicyItem = list.get(position);

        String[] desc = {"Lionel Andrés Messi Cuccittini (hiszpańska wymowa [ljoˈnel anˈdɾes ˈmesi]; ur. 24 czerwca 1987 w Rosario) – argentyński piłkarz występujący na pozycji napastnika w hiszpańskim klubie FC Barcelona oraz w reprezentacji Argentyny, której jest kapitanem. Srebrny medalista Mistrzostw Świata 2014. Złoty medalista Igrzysk Olimpijskich 2008. Najskuteczniejszy zawodnik w historii FC Barcelony.",
                "Neymar Jr swoją profesjonalną karierę zaczynał w Santosie. Od 2009 był podstawowym zawodnikiem pierwszej drużyny. Neymar w wieku 17 lat zadebiutował w meczu przeciwko Oeste 7 marca 2009 roku – Santos wygrał 2:1, kolejny mecz zagrał przeciwko Mogi Mirim tydzień później, podczas którego zdobył swoją pierwszą bramkę w pierwszej drużynie. Został uznany za najbardziej utalentowanego piłkarza z Ameryki Południowej[1]. W półfinale Campeonato Paulista 2009 w pierwszym meczu przeciwko Palmeiras na Estádio Vila Belmiro zdobył gola na wagę zwycięstwa[2].",
                "Luis Alberto Suárez Díaz (wym. [ˈlwiz 'swares], ur. 24 stycznia 1987 w Salto) – urugwajski piłkarz występujący na pozycji napastnika w hiszpańskim klubie FC Barcelona oraz w reprezentacji Urugwaju. Złoty medalista Copa América 2011. Uczestnik Mistrzostw Świata 2010, 2014, Pucharu Konfederacji 2013 oraz Copa América 2016.Wychowanek Varsovii Warszawa. W swojej karierze reprezentował także barwy Delty Warszawa, Legii II Warszawa, Znicza Pruszków, Lecha Poznań oraz Borussii Dortmund.",
                "Robert Lewandowski (ur. 21 sierpnia 1988 w Warszawie) – polski piłkarz występujący na pozycji napastnika w niemieckim klubie Bayern Monachium oraz w reprezentacji Polski, której jest kapitanem[2]. Członek Klubu Wybitnego Reprezentanta[3]. Uczestnik Mistrzostw Europy 2012 i 2016.",
                "Thomas Müller (ur. 13 września 1989 w Weilheim in Oberbayern) – niemiecki piłkarz występujący na pozycji napastnika lub pomocnika w niemieckim klubie Bayern Monachium oraz w reprezentacji Niemiec. Złoty medalista Mistrzostw Świata 2014. Brązowy medalista Mistrzostw Świata 2010. Uczestnik Mistrzostw Europy 2012 i 2016.",
                "Zlatan Ibrahimović (wym. ['zlatan ibra'xi:mɔʋitɕ]; ur. 3 października 1981 w Malmö) – szwedzki piłkarz pochodzenia bośniackiego i chorwackiego występujący na pozycji napastnika w angielskim klubie Manchester United. W latach 2001–2016 reprezentant Szwecji.",
                "Manuel Peter Neuer (ur. 27 marca 1986 w Gelsenkirchen) – niemiecki piłkarz występujący na pozycji bramkarza w niemieckim klubie Bayern Monachium oraz w reprezentacji Niemiec, której jest kapitanem. Złoty medalista Mistrzostw Świata 2014, brązowy medalista Mistrzostw Świata 2010 oraz złoty medalista Mistrzostw Europy U-21 2009. Uczestnik Mistrzostw Europy 2012 i 2016.",
                "Sergio Agüero urodził się 2 czerwca 1988 r. o godzinie 15:23, w Hospital Piñero w Buenos Aires. Jest drugim z siedmiorga dzieci Leonela del Castillo (ur. 07.08.1968 r.) i Adrianny Agüero (ur. 11.05.1970 r.). Dorastał w biednej, nieciekawej okolicy, pełnej narkomanów oraz dilerów. W jednym z wywiadów podkreślił radość z powodu opuszczenia swojego miejsca dorastania, ponieważ wielu jego znajomych uzależniło się od narkotyków, natomiast on dzięki swojej pasji mógł zmienić otoczenie i pomóc rodzinie wyjść z biedy.",
                "Wychowanek Cobreloi, skąd latem 2006 roku trafił do Udinese. Pierwsze dwa lata spędził na wypożyczeniach w Colo-Colo oraz River Plate, a po powrocie do Włoch wywalczył sobie stałe miejsce w podstawowym składzie klubu. W 2011 roku przeniósł się do Barcelony, która zapłaciła Udinese 43 miliony dolarów, czyniąc tym samym Sáncheza najdroższym chilijskim piłkarzem w historii. W lipcu 2014 roku został graczem Arsenalu.",
                "Paul Labile Pogba (ur. 15 marca 1993 w Lagny-sur-Marne) – francuski piłkarz pochodzenia gwinejskiego występujący na pozycji pomocnika w angielskim klubie Manchester United oraz w reprezentacji Francji. Srebrny medalista Mistrzostw Europy 2016. Złoty medalista Mistrzostw Świata U-20 2013. Uczestnik Mistrzostw Świata 2014.",
                "Andrés Iniesta Luján, wym. [anˈdɾes iˈnjesta luˈxan] (ur. 11 maja 1984 w Fuentealbilli) – hiszpański piłkarz występujący na pozycji pomocnika w hiszpańskim klubie FC Barcelona, którego jest kapitanem. Reprezentant Hiszpanii."
        };


        playerImage = (ImageView) findViewById(R.id.playerimg);
        playerName = (TextView) findViewById(R.id.playername);
        playerClub = (TextView) findViewById(R.id.playerclub);
        description = (TextView) findViewById(R.id.playerdesc);

        playerImage.setImageResource(zawodnicyItem.playerImage);
        playerName.setText(zawodnicyItem.playerName);
        playerClub.setText(zawodnicyItem.playerClub);


        r = new Random();
        r2 = new Random();
        int y = r2.nextInt(11);
        int x = r.nextInt(10);
        description.setText(desc[x]);
        ++i;

    }
}