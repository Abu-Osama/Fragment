package com.abuosama.b_34printtwofragmentvalue;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstFragment firstFragment=new FirstFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fm.beginTransaction();
        fragmentTransaction.add(R.id.container1,firstFragment);
        fragmentTransaction.commit();
        SecondFragment sf=new SecondFragment();
        FragmentManager fm1=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction1=fm1.beginTransaction();
        fragmentTransaction1.add(R.id.container2,sf);
        fragmentTransaction1.commit();

    }
}
