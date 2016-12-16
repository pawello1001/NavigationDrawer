package com.example.pawe.navigationdrawer;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.Fragment;
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

public class MeczeTVListAdapter  extends ArrayAdapter<MeczeTVItem> {

    private final Context context;
    List<MeczeTVItem> scores;

    public MeczeTVListAdapter(Context context, List<MeczeTVItem> scores) {
        super(context, R.layout.meczetv_list, scores);
        this.context = context;
        this.scores = scores;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.meczetv_list, null, true);

        ImageView hostImage = (ImageView) rowView.findViewById(R.id.wynikiHostImage);
        ImageView guestImage = (ImageView) rowView.findViewById(R.id.wynikiGuestImage);
        TextView hostName = (TextView) rowView.findViewById(R.id.wynikiHost);
        TextView guestName = (TextView) rowView.findViewById(R.id.wynikiGuest);



        hostImage.setImageResource(scores.get(position).hostImage);
        guestImage.setImageResource(scores.get(position).guestImage);
        hostName.setText(scores.get(position).host);
        guestName.setText(scores.get(position).guest);

        return rowView;
    }
}
