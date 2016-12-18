package com.example.pawe.navigationdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ZespolFragment extends Fragment {


    public ZespolFragment() {
        // Required empty public constructor
    }

    ImageView image;
    TextView name, date, leaugeTitles, globalTitles, coach, stadium, colors;
    int position;
    List<ZespolItem> teams;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_zespol, container, false);
        teams = new ArrayList<ZespolItem>();
        teams.add(new ZespolItem(R.drawable.barcelona, "Barcelona FC", new Date(-11,11,29), 24, 17, "Luiz Enrique", "Camp Nou", "granatowo-bordowe"));
        teams.add(new ZespolItem(R.drawable.real_madrid, "Real Madrid", new Date(2,3,6), 32, 11, "Zinedine Zidane", "Santiago Bernabeu", "białe"));
        teams.add(new ZespolItem(R.drawable.juventus, "Juventus FC", new Date(-13,11,1), 32, 6, "Massimiliano Allegri", "Juventus Stadium", "czarno-białe"));
        teams.add(new ZespolItem(R.drawable.ac_milan, "Associazione Calcio Milan", new Date(-11,12,16), 18, 7, "Vincenzo Montella", "San Siro", "czerwono-czarne"));
        teams.add(new ZespolItem(R.drawable.arsenal, "Arsenal FC", new Date(-14,7,14), 13, 0, "Arsene Wenger", "Emirates Stadium", "czerwono-białe"));
        teams.add(new ZespolItem(R.drawable.bayern_munchen, "Bayern Munchen", new Date(0,2,27), 26, 9, "Carlo Ancelotti", "Allianz Arena Monachium", "czerwono-niebieskie   "));
        teams.add(new ZespolItem(R.drawable.bordeaux, "Girondins Bordeaux", new Date(-19,10,1), 6, 1, "Jocelyn Gourvennec", "Stade Chaban-Delmas", "granatowo-białe"));
        teams.add(new ZespolItem(R.drawable.chelsea, "Chelsea FC", new Date(5,3,10), 5, 1, "Antonio Conte", "Stamford Bridge", "niebieskie"));
        teams.add(new ZespolItem(R.drawable.everton, "Everton FC", new Date(-22,1,2), 24, 0, "Ronald Koeman", "Goodison Park", "niebiesko-białe"));
        teams.add(new ZespolItem(R.drawable.inter, "Inter Mediolan", new Date(8,3,9), 18, 6, "Stefano Pioli", "San Siro", "czarno-niebieskie"));
        teams.add(new ZespolItem(R.drawable.tottenham, "Tottenham Hotspur FC", new Date(-18,4,4), 2, 2, "Mauricio Pochettino", "White Hart Lane", "biało-granatowe"));
        teams.add(new ZespolItem(R.drawable.sevilla, "Sevilla FC", new Date(-10,1,25), 1, 2, "Jorge Sampaoli", "Estadio Ramón Sánchez ", "czerwono-białe"));
        teams.add(new ZespolItem(R.drawable.roma, "Associazione Sportiva Roma", new Date(27,7,22), 3, 0, "Luciano Spalletti", "Stadio Olimpico", "bordowo-pomarańczowe"));
        teams.add(new ZespolItem(R.drawable.psg, "Paris Saint-Germain FC", new Date(70,8,12), 6, 0, "Unai Emery", " Parc des Princes", "granatowo-czerwono-białe"));
        teams.add(new ZespolItem(R.drawable.leicester, "Leicester City FC", new Date(-16,11,9), 1, 0, "Claudio Ranieri", "King Power Stadium", "niebiesko-białe"));
        teams.add(new ZespolItem(R.drawable.liverpool, "Liverpool FC", new Date(-8,3,15), 18, 5, "Jürgen Klopp", "Anfield Arena", "czerwone"));
        teams.add(new ZespolItem(R.drawable.napoli, "SSC Napoli", new Date(26,8,1), 2, 1, "Maurizio Sarri", "Stadio San Paolo", "niebieskie"));
        teams.add(new ZespolItem(R.drawable.monaco, "AS Monaco", new Date(24,8,23), 7, 0, "Leonardo Jardim", "Stadion Ludwika II", "czerwono-białe"));
        teams.add(new ZespolItem(R.drawable.manchester_city, "Manchester City FC", new Date(-20,4,13), 4, 1, "Pep Guardiola", "Etihad Stadium", "niebiesko-białe"));
        teams.add(new ZespolItem(R.drawable.manchester_united, "Manchester United FC", new Date(-22,8,18), 20, 7, "José Mourinho", "Old Trafford", "czerwono-biało-czarne"));
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            position = bundle.getInt("counter");
        }

        image = (ImageView) rootView.findViewById(R.id.zespolImageView);
        name = (TextView) rootView.findViewById(R.id.zespolName);
        date = (TextView) rootView.findViewById(R.id.zespolDate);
        leaugeTitles = (TextView) rootView.findViewById(R.id.zespolLocalTitles);
        globalTitles = (TextView) rootView.findViewById(R.id.zespolGlobalTitles);
        coach = (TextView) rootView.findViewById(R.id.zespolCoach);
        stadium = (TextView) rootView.findViewById(R.id.zespolStadium);
        colors = (TextView) rootView.findViewById(R.id.zespolColors);

        image.setImageResource(teams.get(position).image);
        name.setText(teams.get(position).name);
        date.setText(teams.get(position).date);
        leaugeTitles.setText(String.valueOf(teams.get(position).league_titles));
        globalTitles.setText(String.valueOf(teams.get(position).global_titles));
        coach.setText(teams.get(position).coach);
        stadium.setText(teams.get(position).stadium);
        colors.setText(teams.get(position).colors);

        return rootView;
    }

}
