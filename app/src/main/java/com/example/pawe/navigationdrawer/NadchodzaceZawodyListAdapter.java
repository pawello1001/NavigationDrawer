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

public class NadchodzaceZawodyListAdapter  extends ArrayAdapter<NadchodzaceZawodyItem> {

    private final Context context;
    List<NadchodzaceZawodyItem> incomings;

    public NadchodzaceZawodyListAdapter(Context context, List<NadchodzaceZawodyItem> incomings) {
        super(context, R.layout.nadchodzace_zawody_list, incomings);
        this.context = context;
        this.incomings = incomings;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.nadchodzace_zawody_list, null, true);
        ImageView hostImage = (ImageView) rowView.findViewById(R.id.nadchodzaceZawodyHostImage);
        ImageView guestImage = (ImageView) rowView.findViewById(R.id.nadchodzaceZawodyGuestImage);
        TextView hostName = (TextView) rowView.findViewById(R.id.nadchodzaceZawodyHost);
        TextView guestName = (TextView) rowView.findViewById(R.id.nadchodzaceZawodyGuest);
        TextView date  =(TextView) rowView.findViewById(R.id.nadchodzaceZawodyData);

        hostImage.setImageResource(incomings.get(position).hostImage);
        guestImage.setImageResource(incomings.get(position).guestImage);
        hostName.setText(incomings.get(position).host);
        guestName.setText(incomings.get(position).guest);
        date.setText(incomings.get(position).date);
        return rowView;
    }
}
