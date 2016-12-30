package com.example.pawe.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kamil_2 on 2016-12-29.
 */

public class StartActivity extends Fragment {



    public StartActivity() {
        // Required empty public constructor
    }


    ListView listView;

    List<NewsItem> newses = new ArrayList<NewsItem>();
    String[] newstitle = {
            "Łukasz Teodorczyk przeszedł samego siebie!",
            "Raport WP SportoweFakty",
            "Nigeryjczyk ma zastąpić Nemanję Nikolicia",
            "Były pomocnik Legii Warszawa zagra w Ruchu Chorzów? ",
            "Inter Mediolan zamierza sprowadzić Grzegorza Krychowiaka",
            "Claudio Ranieri otrzyma pieniądze na transfery"
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.start_fragment, container, false);

        newses.add(new NewsItem(R.drawable.news1, newstitle[0], "28 Grudnia 2016, 09:56"));
        newses.add(new NewsItem(R.drawable.news2, newstitle[1], "28 Grudnia 2016, 11:34"));
        newses.add(new NewsItem(R.drawable.news3, newstitle[2], "28 Grudnia 2016, 15:36"));
        newses.add(new NewsItem(R.drawable.news4, newstitle[3], "28 Grudnia 2016, 14:52"));
        newses.add(new NewsItem(R.drawable.news5, newstitle[4], "28 Grudnia 2016, 15:22"));


        NewsListAdapter adapter = new NewsListAdapter(this.getActivity(), newses);
        listView = (ListView) rootView.findViewById(R.id.homeListView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(), NewsActivity.class);
                intent.putExtra("counter", position);
                startActivity(intent);
            }
        });


        return rootView;
    }


}
