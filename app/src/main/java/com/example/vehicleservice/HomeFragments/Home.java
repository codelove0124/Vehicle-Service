package com.example.vehicleservice.HomeFragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.vehicleservice.R;
import com.example.vehicleservice.ServiceBook;

import java.util.ArrayList;
import java.util.List;

public class Home extends Fragment {

    ImageSlider slider;
    CardView bodypaint,carspa,ac,interior,express,scratch,polish,repair,oil;
    Bundle b=new Bundle();

    public Home() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_home, container, false);
        bodypaint=v.findViewById(R.id.bodypaint);
        carspa=v.findViewById(R.id.carspa);
        ac=v.findViewById(R.id.ac);
        interior=v.findViewById(R.id.interior);
        express=v.findViewById(R.id.express);
        scratch=v.findViewById(R.id.scrach);
        polish=v.findViewById(R.id.polish);
        repair=v.findViewById(R.id.repair);
        oil=v.findViewById(R.id.oil);

        bodypaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b.putString("title","Full Body Painting");
                b.putInt("picture",R.drawable.body);
                loadfrag(b);

            }
        });
        scratch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.putString("title","Scratch Removal");
                b.putInt("picture",R.drawable.scratch);
                loadfrag(b);
            }
        });
        polish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.putString("title","Car Polish");
                b.putInt("picture",R.drawable.polish);
                loadfrag(b);
            }
        });
        carspa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.putString("title","Complete Car Spa");
                b.putInt("picture",R.drawable.spa);
                loadfrag(b);
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.putString("title","Car AC Service");
                b.putInt("picture",R.drawable.ac);
                loadfrag(b);
            }
        });
        interior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.putString("title","Car Interior Detailing");
                b.putInt("picture",R.drawable.interior);
                loadfrag(b);
            }
        });
        express.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.putString("title","Car Express Service");
                b.putInt("picture",R.drawable.express);
                loadfrag(b);
            }
        });
        repair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.putString("title","Car Repair Job");
                b.putInt("picture",R.drawable.repair);
                loadfrag(b);
            }
        });
        oil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.putString("title","Car Oil Change Package");
                b.putInt("picture",R.drawable.oil);
                loadfrag(b);
            }
        });



        return v;
    }
 public void loadfrag(Bundle bundle)
 {
     Intent i=new Intent(getActivity(),ServiceBook.class);
     i.putExtras(bundle);
     startActivity(i);
 }
}