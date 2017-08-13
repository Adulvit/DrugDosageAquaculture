package com.example.adulvitc.drugdosageaquaculture.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.adulvitc.drugdosageaquaculture.R;
import com.example.adulvitc.drugdosageaquaculture.manager.MyAdapter;
import com.example.adulvitc.drugdosageaquaculture.manager.MyConstant;

/**
 * Created by Adulvitc on 7/8/2560.
 */

public class ServiceFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_service, container, false);
        return  view;
    }  //onCreateView

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        //Create Listview
        ListView listView = getView().findViewById(R.id.listview);
        MyConstant myConstant = new MyConstant();
        final int[] iconInts = myConstant.getImageInts();
        final String[] titleStrings = myConstant.getTitleStrings();
        final String[] detailStrings = myConstant.getDetailStrings();
        final String[] longdetailStrings = myConstant.getLongdetailStrings();

        MyAdapter myAdapter = new MyAdapter(getContext(), iconInts, titleStrings, detailStrings);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

              DetailFragment detailFragment = new DetailFragment();
              getActivity().getSupportFragmentManager()
                .beginTransaction()
                      .replace(R.id.myContent, DetailFragment.detailInstant(iconInts[i],
                              titleStrings[i], detailStrings[i],longdetailStrings[i]))
                .addToBackStack(null)
                .commit();
            }
        });



    }  //onActivityCreated


}  //Main Class
