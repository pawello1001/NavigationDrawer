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
public class NewsFragment extends Fragment {

    public NewsFragment() {
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
            "Claudio Ranieri otrzyma pieniądze na transfery",
            "FC Barcelona i Manchester City powalczą o niemiecki talent",
            "Manchester United może stracić swoją gwiazdę",
            "Artur Jędrzejczyk nie pomoże Legii Warszawa w Lidze Europy",
            "Dwóch piłkarzy Lecha Poznań czeka na wypożyczenia",
            " Glik \"pozamiatał\" swoim wpisem"
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.news_fragment, container, false);

        // getActionBar().setTitle("OMG");

        newses.add(new NewsItem(R.drawable.news1, newstitle[0], "28 Grudnia 2016, 09:56"));
        newses.add(new NewsItem(R.drawable.news2, newstitle[1], "28 Grudnia 2016, 11:34"));
        newses.add(new NewsItem(R.drawable.news3, newstitle[2], "28 Grudnia 2016, 15:36"));
        newses.add(new NewsItem(R.drawable.news4, newstitle[3], "28 Grudnia 2016, 14:52"));
        newses.add(new NewsItem(R.drawable.news5, newstitle[4], "28 Grudnia 2016, 15:22"));
        newses.add(new NewsItem(R.drawable.news6, newstitle[5], "28 Grudnia 2016, 15:27"));
        newses.add(new NewsItem(R.drawable.news7, newstitle[6], "28 Grudnia 2016, 15:30"));
        newses.add(new NewsItem(R.drawable.news8, newstitle[7], "28 Grudnia 2016, 15:35"));
        newses.add(new NewsItem(R.drawable.news9, newstitle[8], "28 Grudnia 2016, 14:36"));
        newses.add(new NewsItem(R.drawable.news10, newstitle[9], "28 Grudnia 2016, 14:50"));
        newses.add(new NewsItem(R.drawable.news11, newstitle[10], "28 Grudnia 2016, 13:30"));

        NewsListAdapter adapter = new NewsListAdapter(this.getActivity(), newses);
        listView = (ListView) rootView.findViewById(R.id.newsListView);
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

    public List<NewsItem> getScores() {
        newses.clear();
        newses.add(new NewsItem(R.drawable.news1, newstitle[0], "28 Grudnia 2016, 09:56"));
        newses.add(new NewsItem(R.drawable.news2, newstitle[1], "28 Grudnia 2016, 11:34"));
        newses.add(new NewsItem(R.drawable.news3, newstitle[2], "28 Grudnia 2016, 15:36"));
        newses.add(new NewsItem(R.drawable.news4, newstitle[3], "28 Grudnia 2016, 14:52"));
        newses.add(new NewsItem(R.drawable.news5, newstitle[4], "28 Grudnia 2016, 15:22"));
        newses.add(new NewsItem(R.drawable.news6, newstitle[5], "28 Grudnia 2016, 15:27"));
        newses.add(new NewsItem(R.drawable.news7, newstitle[6], "28 Grudnia 2016, 15:30"));
        newses.add(new NewsItem(R.drawable.news8, newstitle[7], "28 Grudnia 2016, 15:35"));
        newses.add(new NewsItem(R.drawable.news9, newstitle[8], "28 Grudnia 2016, 14:36"));
        newses.add(new NewsItem(R.drawable.news10, newstitle[9], "28 Grudnia 2016, 14:50"));
        newses.add(new NewsItem(R.drawable.news11, newstitle[10], "28 Grudnia 2016, 13:30"));
        return newses;
    }
}
