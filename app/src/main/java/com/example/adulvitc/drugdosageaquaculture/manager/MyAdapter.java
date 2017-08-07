package com.example.adulvitc.drugdosageaquaculture.manager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adulvitc.drugdosageaquaculture.R;

/**
 * Created by Adulvitc on 7/8/2560.
 */

public class MyAdapter extends BaseAdapter{
    private Context context;
    private int[] iconInts;
    private String[] titleStrings, detailStrings;


    public MyAdapter(Context context,
                     int[] iconInts,
                     String[] titleStrings,
                     String[] detailStrings) {
        this.context = context;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.listview_layout, viewGroup, false);

        ImageView imageView = view1.findViewById(R.id.imvIcon);
        imageView.setImageResource(iconInts[i]);

        TextView titleTextView = view1.findViewById(R.id.txtTitle);
        titleTextView.setText(titleStrings[i]);

        TextView deTailTecTextView = view1.findViewById(R.id.txtDetail);
        deTailTecTextView.setText(detailStrings[i]);


        return view1;
    }

    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }
}  //Main Class
