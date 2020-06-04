package com.example.vehicleservice.HomeFragments;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vehicleservice.R;


public class BookScreen extends Fragment {

    TextView title;
    ImageView pic;
    int i;
    String t;

    public BookScreen(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_book_screen, container, false);
        pic=v.findViewById(R.id.picture);
        title=v.findViewById(R.id.title1);
       Bundle b=getArguments();

       i=b.getInt("picture");
       t=b.getString("title");
       title.setText(t);
    pic.setBackgroundResource(i);



        return v;
    }

}