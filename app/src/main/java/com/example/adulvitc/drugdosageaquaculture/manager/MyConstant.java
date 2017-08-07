package com.example.adulvitc.drugdosageaquaculture.manager;

import com.example.adulvitc.drugdosageaquaculture.R;

/**
 * Created by Adulvitc on 7/8/2560.
 */

public class MyConstant {

    // For Image
    private int[] imageInts = new int[]{R.drawable.alfanor,
            R.drawable.antibac,
            R.drawable.tenamoxin,
            R.drawable.aquac,
            R.drawable.aqaunes,
            R.drawable.oxybac50};


    //For Title
    private  String[] titleStrings = new String[]{
            "Title1",
            "Title2",
            "Title3",
            "Title4",
            "Title5",
            "Title6"};


    //For Detail
    private String[] detailStrings = new String[]{
            "Detail1",
            "Detail2",
            "Detail3",
            "Detail4",
            "Detail5",
            "Detail6"};

    public int[] getImageInts() {
        return imageInts;
    }

    public String[] getTitleStrings() {
        return titleStrings;
    }

    public String[] getDetailStrings() {
        return detailStrings;
    }
}  //Main Class
