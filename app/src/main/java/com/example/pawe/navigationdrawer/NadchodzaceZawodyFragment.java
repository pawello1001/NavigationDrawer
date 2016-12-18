package com.example.pawe.navigationdrawer;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NadchodzaceZawodyFragment extends Fragment {

    public NadchodzaceZawodyFragment() {
        // Required empty public constructor
    }

    ListView listView;

    List<NadchodzaceZawodyItem> incomings = new ArrayList<NadchodzaceZawodyItem>();
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

        View rootView = inflater.inflate(R.layout.fragment_nadchodzace_zawody, container, false);

        incomings.add(new NadchodzaceZawodyItem(R.drawable.leicester, clubs[8], new Date(117,1,1), true, clubs[4], R.drawable.everton));
        incomings.add(new NadchodzaceZawodyItem(R.drawable.real_madrid, clubs[1], new Date(117,1,1), false, clubs[11], R.drawable.manchester_city));
        incomings.add(new NadchodzaceZawodyItem(R.drawable.bordeaux, clubs[17], new Date(117,1,2), true, clubs[12], R.drawable.ac_milan));
        incomings.add(new NadchodzaceZawodyItem(R.drawable.tottenham, clubs[5], new Date(117,1,2), false, clubs[0], R.drawable.barcelona));
        incomings.add(new NadchodzaceZawodyItem(R.drawable.inter, clubs[9], new Date(117,1,3), true, clubs[18], R.drawable.sevilla));
        incomings.add(new NadchodzaceZawodyItem(R.drawable.juventus, clubs[13], new Date(117,1,3), false, clubs[2], R.drawable.arsenal));
        incomings.add(new NadchodzaceZawodyItem(R.drawable.psg, clubs[7], new Date(117,1,4), true, clubs[10], R.drawable.manchester_united));
        incomings.add(new NadchodzaceZawodyItem(R.drawable.roma, clubs[15], new Date(117,1,4), false, clubs[16], R.drawable.monaco));
        incomings.add(new NadchodzaceZawodyItem(R.drawable.bayern_munchen, clubs[3], new Date(117,1,5), true, clubs[6], R.drawable.chelsea));
        incomings.add(new NadchodzaceZawodyItem(R.drawable.liverpool, clubs[19], new Date(117,1,5), false, clubs[14], R.drawable.napoli));

        NadchodzaceZawodyListAdapter adapter = new NadchodzaceZawodyListAdapter(this.getActivity(), incomings);
        listView = (ListView) rootView.findViewById(R.id.incomingListView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(), NadchodzaceZawodyActivity.class);
                intent.putExtra("counter", position);
                startActivity(intent);
            }
        });

        return rootView;
    }

    public List<NadchodzaceZawodyItem> getIncomings() {
        incomings.clear();
        incomings.add(new NadchodzaceZawodyItem(R.drawable.leicester, clubs[8], new Date(117,1,1), true, clubs[4], R.drawable.everton));
        incomings.add(new NadchodzaceZawodyItem(R.drawable.real_madrid, clubs[1], new Date(117,1,1), false, clubs[11], R.drawable.manchester_city));
        incomings.add(new NadchodzaceZawodyItem(R.drawable.bordeaux, clubs[17], new Date(117,1,2), true, clubs[12], R.drawable.ac_milan));
        incomings.add(new NadchodzaceZawodyItem(R.drawable.tottenham, clubs[5], new Date(117,1,2), false, clubs[0], R.drawable.barcelona));
        incomings.add(new NadchodzaceZawodyItem(R.drawable.inter, clubs[9], new Date(117,1,3), true, clubs[18], R.drawable.sevilla));
        incomings.add(new NadchodzaceZawodyItem(R.drawable.juventus, clubs[13], new Date(117,1,3), false, clubs[2], R.drawable.arsenal));
        incomings.add(new NadchodzaceZawodyItem(R.drawable.psg, clubs[7], new Date(117,1,4), true, clubs[10], R.drawable.manchester_united));
        incomings.add(new NadchodzaceZawodyItem(R.drawable.roma, clubs[15], new Date(117,1,4), false, clubs[16], R.drawable.monaco));
        incomings.add(new NadchodzaceZawodyItem(R.drawable.bayern_munchen, clubs[3], new Date(117,1,5), true, clubs[6], R.drawable.chelsea));
        incomings.add(new NadchodzaceZawodyItem(R.drawable.liverpool, clubs[19], new Date(117,1,5), false, clubs[14], R.drawable.napoli));
        return incomings;
    }
}
