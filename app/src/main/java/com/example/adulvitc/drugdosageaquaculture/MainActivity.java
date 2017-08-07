package com.example.adulvitc.drugdosageaquaculture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.adulvitc.drugdosageaquaculture.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //Add Fragment to Activity
        if (savedInstanceState == null) {
            MainFragment mainFragment = new MainFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.myContent, mainFragment)
                    .commit();
        }




    } // Main Method






}  // Main class
