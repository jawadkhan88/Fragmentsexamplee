package com.example.cuatd.fragmentsexamplee;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout = (FrameLayout)findViewById(R.id.myframe);

    }
    public void btnFragment1_Click(View view)
    {
        FragmentManager fm = this.getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        BlankFragment f1 = new BlankFragment();
        frameLayout.removeAllViews();
        ft.add(R.id.myframe, f1);
        ft.replace(R.id.myframe,f1);
        ft.commit();
    }
    public void btnFragment4_Click(View view)
    {
        FragmentManager fm = this.getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        forthfragment f1 = new forthfragment();
        frameLayout.removeAllViews();
        ft.add(R.id.myframe, f1);
        ft.replace(R.id.myframe,f1);
        ft.commit();
    }

    public void btnFragmentData_Click(View view)
    {
        //sending data to acivity we use intent class
        //Sendind data to fragment we use bundle class
        Bundle bundle = new Bundle();
        bundle.putString("DATA", "Pakistan");
        FragmentManager fm = this.getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        SecondFragment f2 = new SecondFragment();
        f2.setArguments(bundle);
       frameLayout.removeAllViews();
        ft.add(R.id.myframe, f2);
        //for commit fragment transaction to perform action pass
        ft.commit();
    }
    public void BtnAddfragment_Click(View view)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("NUM", 20);
        FragmentManager fm = this.getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        ADDFragments f3 = new ADDFragments();
        f3.setArguments(bundle);
        frameLayout.removeAllViews();
        ft.add(R.id.myframe, f3);
        //for commit fragment transaction to perform action pass
        ft.commit();
    }
    public void onclickFifthbutton(View view)
    {
        Bundle bundle = new Bundle();
        bundle.putString("DATA", "Pakistan");
        FragmentManager fm =this.getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        FifthtFragment f5=new FifthtFragment();
        f5.setArguments(bundle);
        frameLayout.removeAllViews();
        ft.add(R.id.myframe,f5);
        ft.commit();
    }
}
