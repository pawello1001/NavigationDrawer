package com.example.pawe.navigationdrawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import java.util.List;

/**
 * Created by Kamil_2 on 2016-12-30.
 */

public class ZawodnicyListAdapter extends ArrayAdapter<ZawodnicyItem> {


        private final Context context;
        List<ZawodnicyItem> players;

        public ZawodnicyListAdapter(Context context, List<ZawodnicyItem> players) {
            super(context, R.layout.zawodnicy_list, players);
            this.context = context;
            this.players =players;
        }



        public View getView(int position, View view, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(R.layout.zawodnicy_list, null, true);

            ImageView playerImage = (ImageView) rowView.findViewById(R.id.player_photo);
            TextView playerName = (TextView) rowView.findViewById(R.id.player_name);
            TextView playerClub = (TextView) rowView.findViewById(R.id.player_club);

            playerImage.setImageResource(players.get(position).playerImage);
            playerName.setText(players.get(position).playerName);
            playerClub.setText(players.get(position).playerClub);

            return rowView;
        }
    }






