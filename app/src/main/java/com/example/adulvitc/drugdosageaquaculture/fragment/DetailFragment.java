package com.example.adulvitc.drugdosageaquaculture.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adulvitc.drugdosageaquaculture.R;

/**
 * Created by Adulvitc on 7/8/2560.
 */

public class  DetailFragment extends Fragment{

    private int imageAnInt;
    private String titleString, detailString,longString;

    public static DetailFragment detailInstant(int intImage,
                                               String strTitle,
                                               String strDetail,
                                               String longString){

        DetailFragment detailFragment = new DetailFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("Icon", intImage);
        bundle.putString("Title", strTitle);
        bundle.putString("Detail", strDetail);
        bundle.putString("long_detail",longString);
        detailFragment.setArguments(bundle);


        return detailFragment;
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        return view;

    } // onCreateView

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get Value From Argument
        imageAnInt = getArguments().getInt("Icon");
        titleString = getArguments().getString("Title");
        detailString = getArguments().getString("Detail");
        longString = getArguments().getString("long_detail");

        String tag = "7AugV1";
        Log.d(tag, "Title ==>" + titleString);
        Log.d(tag,"Detail ==>" + detailString);
        Log.d(tag, "long_detail ==>" + longString);

    } // OnCreate

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        // ShowView
        showView();

        //Back Controller
        backController();


    } // OnActivityCreated

    private void showView() {
        ImageView imageView = getView().findViewById(R.id.imvIcon);
        imageView.setImageResource(imageAnInt);

        TextView titleTextView = getView().findViewById(R.id.txtTitle);
        titleTextView.setText(titleString);

        TextView detailTextView = getView().findViewById(R.id.txtDetail);
        detailTextView.setText(detailString);

        TextView longdetailTextView = getView().findViewById(R.id.txtDetail2);
        longdetailTextView.setText(longString);
    }

    private void backController() {
        Button button = getView().findViewById(R.id.btnBack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });
    }


}  // Main Class
