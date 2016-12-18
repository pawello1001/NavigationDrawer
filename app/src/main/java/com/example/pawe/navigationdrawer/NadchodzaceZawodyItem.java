package com.example.pawe.navigationdrawer;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Paweł on 2016-12-13.
 */

public class NadchodzaceZawodyItem {
    Integer hostImage;
    Integer guestImage;
    String host;
    String guest;
    String date;
    SimpleDateFormat df = new SimpleDateFormat("HH:mm dd MMMM yyyy");

    public NadchodzaceZawodyItem(Integer hostImage, String host, Date date, boolean whatDate, String guest, Integer guestImage) {
        this.hostImage = hostImage;
        this.host = host;
        this.date = df.format(date);
        this.guest = guest;
        this.guestImage = guestImage;
    }
}
