package com.example.pawe.navigationdrawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Paweł on 2016-12-13.
 */

public class NewsListAdapter  extends ArrayAdapter<NewsItem> {

    private final Context context;
    List<NewsItem> newses;

    public NewsListAdapter(Context context, List<NewsItem> newses) {
        super(context, R.layout.news_list, newses);
        this.context = context;
        this.newses =newses;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.news_list, null, true);

        ImageView newsImage = (ImageView) rowView.findViewById(R.id.newsphoto);
        TextView newsName = (TextView) rowView.findViewById(R.id.news_title);
        TextView newsDate = (TextView) rowView.findViewById(R.id.news_date);

        newsImage.setImageResource(newses.get(position).newsImage);
        newsName.setText(newses.get(position).newsTitle);
        newsDate.setText(newses.get(position).newsDate);

        return rowView;
    }
}
