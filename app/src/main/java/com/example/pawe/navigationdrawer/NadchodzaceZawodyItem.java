package com.example.pawe.navigationdrawer;

/**
 * Created by Paweł on 2016-12-13.
 */

public class NadchodzaceZawodyItem {
    Integer hostImage;
    Integer guestImage;
    String host;
    String guest;
    String hostScore;
    String guestScore;

    public NadchodzaceZawodyItem(Integer hostImage, String host, String hostScore, String guestScore, String guest, Integer guestImage) {
        this.hostImage = hostImage;
        this.host = host;
        this.hostScore = hostScore;
        this.guestScore = guestScore;
        this.guest = guest;
        this.guestImage = guestImage;
    }
}
