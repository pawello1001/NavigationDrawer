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
public class ZawodnicyFragment extends Fragment {

    public ZawodnicyFragment() {
        // Required empty public constructor
    }

    ListView listView;

    List<ZawodnicyItem> players = new ArrayList<ZawodnicyItem>();
    String[] playersnames = {
            "Lionel Messi",
            "Neymar",
            "Luis Suarez",
            "Robert Lewandowski",
            "Thomas Mueller",
            "Zlatan Ibrahimović",
            "Manuel Neuer",
            "Sergio Aguero",
            "Alexis Sanchez",
            "Paul Pogba",
            "Andres Iniesta"
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.zawodnicy_fragment, container, false);

        // getActionBar().setTitle("OMG");

        players.add(new ZawodnicyItem(R.drawable.news1, playersnames[0], "FC Barcelona"));
        players.add(new ZawodnicyItem(R.drawable.news2, playersnames[1], "FC Barcelona"));
        players.add(new ZawodnicyItem(R.drawable.news3, playersnames[2], "FC Barcelona"));
        players.add(new ZawodnicyItem(R.drawable.news4, playersnames[3], "Bayern Monachium"));
        players.add(new ZawodnicyItem(R.drawable.news5, playersnames[4], "Bayern Monachium"));
        players.add(new ZawodnicyItem(R.drawable.news6, playersnames[5], "Manchester United"));
        players.add(new ZawodnicyItem(R.drawable.news7, playersnames[6], "Bayern Monachium"));
        players.add(new ZawodnicyItem(R.drawable.news8, playersnames[7], "Manchester City"));
        players.add(new ZawodnicyItem(R.drawable.news9, playersnames[8], "Arsenal Londyn"));
        players.add(new ZawodnicyItem(R.drawable.news10, playersnames[9], "Manchester United"));
        players.add(new ZawodnicyItem(R.drawable.news11, playersnames[10], "FC Barcelona"));

        ZawodnicyListAdapter adapter = new ZawodnicyListAdapter(this.getActivity(), players);
        listView = (ListView) rootView.findViewById(R.id.playerListView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(), ZawodnicyActivity.class);
                intent.putExtra("counter", position);
                startActivity(intent);
            }
        });

        return rootView;
    }

    public List<ZawodnicyItem> getScores() {
       players.clear();
        players.add(new ZawodnicyItem(R.drawable.news1, playersnames[0], "FC Barcelona"));
        players.add(new ZawodnicyItem(R.drawable.news2, playersnames[1], "FC Barcelona"));
        players.add(new ZawodnicyItem(R.drawable.news3, playersnames[2], "FC Barcelona"));
        players.add(new ZawodnicyItem(R.drawable.news4, playersnames[3], "Bayern Monachium"));
        players.add(new ZawodnicyItem(R.drawable.news5, playersnames[4], "Bayern Monachium"));
        players.add(new ZawodnicyItem(R.drawable.news6, playersnames[5], "Manchester United"));
        players.add(new ZawodnicyItem(R.drawable.news7, playersnames[6], "Bayern Monachium"));
        players.add(new ZawodnicyItem(R.drawable.news8, playersnames[7], "Manchester City"));
        players.add(new ZawodnicyItem(R.drawable.news9, playersnames[8], "Arsenal Londyn"));
        players.add(new ZawodnicyItem(R.drawable.news10, playersnames[9], "Manchester United"));
        players.add(new ZawodnicyItem(R.drawable.news11, playersnames[10], "FC Barcelona"));
        return players;
    }
}