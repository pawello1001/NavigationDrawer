package com.example.pawe.navigationdrawer;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
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
public class WynikiFragment extends Fragment {

    public WynikiFragment() {
        // Required empty public constructor
    }

    ListView listView;
    List<WynikiItem> scores = new ArrayList<WynikiItem>();
    String[] clubs = {
            " Barcelona ", " Real Madrid ", " Arsenal FC ",
            " Bayern Munich ", " Everton FC ", " Tottenham FC ",
            " Chelsea FC ", " PSG ", " Leicester FC ",
            " Inter Mediolan ", " Man United ", " Man City ",
            " AC Milan ", " Juventus Turyn ", " SSC Napoli ",
            " Roma FC ", " FC Monaco ", " Bordeaux FC ",
            " Sevilla FC ", " Liverpool FC "
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_wyniki, container, false);

        scores.add(new WynikiItem(R.drawable.barcelona, clubs[0], "3", "3", clubs[1], R.drawable.real_madrid));
        scores.add(new WynikiItem(R.drawable.arsenal, clubs[2], "2", "2", clubs[3], R.drawable.bayern_munchen));
        scores.add(new WynikiItem(R.drawable.everton, clubs[4], "1", "4", clubs[5], R.drawable.tottenham));
        scores.add(new WynikiItem(R.drawable.chelsea, clubs[6], "3", "2", clubs[7], R.drawable.psg));
        scores.add(new WynikiItem(R.drawable.leicester, clubs[8], "1", "1", clubs[9], R.drawable.inter));
        scores.add(new WynikiItem(R.drawable.manchester_united, clubs[10], "1", "3", clubs[11], R.drawable.manchester_city));
        scores.add(new WynikiItem(R.drawable.ac_milan, clubs[12], "1", "0", clubs[13], R.drawable.juventus));
        scores.add(new WynikiItem(R.drawable.napoli, clubs[14], "0", "0", clubs[15], R.drawable.roma));
        scores.add(new WynikiItem(R.drawable.monaco, clubs[16], "2", "1", clubs[17], R.drawable.bordeaux));
        scores.add(new WynikiItem(R.drawable.sevilla, clubs[18], "1", "3", clubs[19], R.drawable.liverpool));

        WynikiListAdapter adapter = new WynikiListAdapter(this.getActivity(), scores);
        listView = (ListView) rootView.findViewById(R.id.resultListView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(), WynikiStatsActivity.class);
                intent.putExtra("counter", position+1);
                startActivityForResult(intent, 2);
            }
        });

        return rootView;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == 12) {
            ZespolFragment fragment = new ZespolFragment();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        }
    }

    public List<WynikiItem> getScores() {
        scores.clear();
        scores.add(new WynikiItem(R.drawable.barcelona, clubs[0], "3", "3", clubs[1], R.drawable.real_madrid));
        scores.add(new WynikiItem(R.drawable.barcelona, clubs[0], "3", "3", clubs[1], R.drawable.real_madrid));
        scores.add(new WynikiItem(R.drawable.arsenal, clubs[2], "2", "2", clubs[3], R.drawable.bayern_munchen));
        scores.add(new WynikiItem(R.drawable.everton, clubs[4], "1", "4", clubs[5], R.drawable.tottenham));
        scores.add(new WynikiItem(R.drawable.chelsea, clubs[6], "3", "2", clubs[7], R.drawable.psg));
        scores.add(new WynikiItem(R.drawable.leicester, clubs[8], "1", "1", clubs[9], R.drawable.inter));
        scores.add(new WynikiItem(R.drawable.manchester_united, clubs[10], "1", "3", clubs[11], R.drawable.manchester_city));
        scores.add(new WynikiItem(R.drawable.ac_milan, clubs[12], "1", "0", clubs[13], R.drawable.juventus));
        scores.add(new WynikiItem(R.drawable.napoli, clubs[14], "0", "0", clubs[15], R.drawable.roma));
        scores.add(new WynikiItem(R.drawable.monaco, clubs[16], "2", "1", clubs[17], R.drawable.bordeaux));
        scores.add(new WynikiItem(R.drawable.sevilla, clubs[18], "1", "3", clubs[19], R.drawable.liverpool));
        return scores;
    }
}
