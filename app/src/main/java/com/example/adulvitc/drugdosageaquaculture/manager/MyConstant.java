package com.example.adulvitc.drugdosageaquaculture.manager;

import com.example.adulvitc.drugdosageaquaculture.R;

/**
 * Created by Adulvitc on 7/8/2560.
 */

public class MyConstant {

    // For Image
    private int[] imageInts = new int[]{
            R.drawable.alfanor1,
            R.drawable.antibac1,
            R.drawable.tenamoxin1,
            R.drawable.aquac,
            R.drawable.aqaunes1,
            R.drawable.oxybac501,
            R.drawable.adekm,
            R.drawable.unknown1};


    //For Title
    private  String[] titleStrings = new String[]{
            "Alfanor 100",
            "Antibac",
            "Tenamoxin 500 WSP",
            "Aqua-C",
            "Aquanes",
            "Oxybac 50",
            "Adek-M",
            "Unknown"};


    //For Detail
    private String[] detailStrings = new String[]{
            "Enrofloxacin 10%",
            "Sulfadimethoxine 25% + Trimethoprim 5%",
            "Amoxicillin 50%",
            "Vitamin C 10%",
            "Euglenal 5%",
            "Oxytetracycline HCL 50%",
            "Vitamin & Amino Acid solution",
            "???"};

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
