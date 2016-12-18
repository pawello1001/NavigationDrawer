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

public class ZakladyListAdapter  extends ArrayAdapter<ZakladyItem> {

    private final Context context;
    List<ZakladyItem> scores;

    public ZakladyListAdapter(Context context, List<ZakladyItem> scores) {
        super(context, R.layout.zaklady_list, scores);
        this.context = context;
        this.scores = scores;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.zaklady_list, null, true);

        ImageView hostImage = (ImageView) rowView.findViewById(R.id.wynikiHostImage);
        ImageView guestImage = (ImageView) rowView.findViewById(R.id.nadchodzaceZawodyGuestImage);
        TextView hostName = (TextView) rowView.findViewById(R.id.wynikiHost);
        TextView guestName = (TextView) rowView.findViewById(R.id.wynikiGuest);



        hostImage.setImageResource(scores.get(position).hostImage);
        guestImage.setImageResource(scores.get(position).guestImage);
        hostName.setText(scores.get(position).host);
        guestName.setText(scores.get(position).guest);

        return rowView;
    }
}
