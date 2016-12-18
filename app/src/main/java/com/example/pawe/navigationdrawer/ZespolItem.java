package com.example.pawe.navigationdrawer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Paweł on 2016-12-16.
 */

public class ZespolItem {
    Integer image;
    String name;
    String date;
    SimpleDateFormat df = new SimpleDateFormat("dd MM yyyy");
    int league_titles;
    int global_titles;
    String coach;
    String stadium;
    String colors;

    public ZespolItem(Integer image, String name, Date date, int league_titles, int global_titles, String coach, String stadium, String colors) {
        this.image = image;
        this.name = name;
        this.date = df.format(date);
        this.league_titles = league_titles;
        this.global_titles = global_titles;
        this.coach = coach;
        this.stadium = stadium;
        this.colors = colors;
    }
}
