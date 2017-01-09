package com.example.pawe.navigationdrawer;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MeczeTVFragment extends Fragment {

    public MeczeTVFragment() {
        // Required empty public constructor
    }

    ListView listView;

    List<MeczeTVItem> scores = new ArrayList<MeczeTVItem>();

    String[] kraj = {
            " TVP1 ", " Polsat ", " TVP Sport ",
            " CANAL+ Sport ", " Eurosport 1 ", " nSport+ ",
            " Eurosport 2 ", " Polsat Sport News ", " Polsat Sport ",
            " CANAL+ Sport2 ", " ESPN ", " TVP1 "
    };

    String[] clubs = {
            " Barcelona ", " Real Madrid ", " Arsenal FC ",
            " Bayern ", " Everton FC ", " Tottenham FC ",
            " Chelsea FC ", " PSG ", " Leicester FC ",
            " Inter Med. ", " Man United ", " Man City ",
            " AC Milan ", " Juventus ", " SSC Napoli ",
            " Roma FC ", " FC Monaco ", " Bordeaux FC ",
            " Sevilla FC ", " Liverpool FC "
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.meczetv_fragment, container, false);

       // getActionBar().setTitle("OMG");

        scores.add(new MeczeTVItem(R.drawable.barcelona, clubs[0], "3", "3", clubs[1], kraj[0], R.drawable.real_madrid));
        scores.add(new MeczeTVItem(R.drawable.barcelona, clubs[0], "3", "3", clubs[1], kraj[0], R.drawable.real_madrid));
        scores.add(new MeczeTVItem(R.drawable.arsenal, clubs[2], "2", "2", clubs[3], kraj[1], R.drawable.bayern_munchen));
        scores.add(new MeczeTVItem(R.drawable.everton, clubs[4], "1", "4", clubs[5], kraj[1], R.drawable.tottenham));
        scores.add(new MeczeTVItem(R.drawable.chelsea, clubs[6], "3", "2", clubs[7], kraj[2],R.drawable.psg));
        scores.add(new MeczeTVItem(R.drawable.leicester, clubs[8], "1", "1", clubs[9], kraj[2],R.drawable.inter));
        scores.add(new MeczeTVItem(R.drawable.manchester_united, clubs[10], "1", "3", clubs[11], kraj[3],R.drawable.manchester_city));
        scores.add(new MeczeTVItem(R.drawable.ac_milan, clubs[12], "1", "0", clubs[13], kraj[4],R.drawable.juventus));
        scores.add(new MeczeTVItem(R.drawable.napoli, clubs[14], "0", "0", clubs[15], kraj[5],R.drawable.roma));
        scores.add(new MeczeTVItem(R.drawable.monaco, clubs[16], "2", "1", clubs[17], kraj[6],R.drawable.bordeaux));
        scores.add(new MeczeTVItem(R.drawable.sevilla, clubs[18], "1", "3", clubs[19], kraj[7],R.drawable.liverpool));

        MeczeTVListAdapter adapter = new MeczeTVListAdapter(this.getActivity(), scores);
        listView = (ListView) rootView.findViewById(R.id.resultListView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(), MeczeTVActivity.class);
                intent.putExtra("counter", position);
                startActivity(intent);
            }
        });

        return rootView;
    }

    public List<MeczeTVItem> getScores() {
        scores.clear();
        scores.add(new MeczeTVItem(R.drawable.barcelona, clubs[0], "3", "3", clubs[1], kraj[0], R.drawable.real_madrid));
        scores.add(new MeczeTVItem(R.drawable.barcelona, clubs[0], "3", "3", clubs[1], kraj[0], R.drawable.real_madrid));
        scores.add(new MeczeTVItem(R.drawable.arsenal, clubs[2], "2", "2", clubs[3], kraj[1], R.drawable.bayern_munchen));
        scores.add(new MeczeTVItem(R.drawable.everton, clubs[4], "1", "4", clubs[5], kraj[1], R.drawable.tottenham));
        scores.add(new MeczeTVItem(R.drawable.chelsea, clubs[6], "3", "2", clubs[7], kraj[2],R.drawable.psg));
        scores.add(new MeczeTVItem(R.drawable.leicester, clubs[8], "1", "1", clubs[9], kraj[2],R.drawable.inter));
        scores.add(new MeczeTVItem(R.drawable.manchester_united, clubs[10], "1", "3", clubs[11], kraj[3],R.drawable.manchester_city));
        scores.add(new MeczeTVItem(R.drawable.ac_milan, clubs[12], "1", "0", clubs[13], kraj[4],R.drawable.juventus));
        scores.add(new MeczeTVItem(R.drawable.napoli, clubs[14], "0", "0", clubs[15], kraj[5],R.drawable.roma));
        scores.add(new MeczeTVItem(R.drawable.monaco, clubs[16], "2", "1", clubs[17], kraj[6],R.drawable.bordeaux));
        scores.add(new MeczeTVItem(R.drawable.sevilla, clubs[18], "1", "3", clubs[19], kraj[7],R.drawable.liverpool));
        return scores;
    }
}
