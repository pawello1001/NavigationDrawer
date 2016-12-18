package com.example.pawe.navigationdrawer;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Paweł on 2016-12-16.
 */

public class ZespolyListAdapter  extends BaseAdapter {

    private Context context;

    public Integer[] clubs = {
            R.drawable.barcelona, R.drawable.real_madrid,
            R.drawable.juventus, R.drawable.ac_milan,
            R.drawable.arsenal, R.drawable.bayern_munchen,
            R.drawable.bordeaux, R.drawable.chelsea,
            R.drawable.everton, R.drawable.inter,
            R.drawable.tottenham, R.drawable.sevilla,
            R.drawable.roma, R.drawable.psg,
            R.drawable.leicester, R.drawable.liverpool,
            R.drawable.napoli, R.drawable.monaco,
            R.drawable.manchester_city, R.drawable.manchester_united
    };

    public ZespolyListAdapter(Context c) {
        this.context = c;
    }

    @Override
    public int getCount() {
        return clubs.length;
    }

    @Override
    public Object getItem(int position) {
        return clubs[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(clubs[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(256, 256));
        return imageView;
    }
}
