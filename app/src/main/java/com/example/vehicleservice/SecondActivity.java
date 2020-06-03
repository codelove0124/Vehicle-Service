package com.example.vehicleservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    ImageSlider slider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        slider=findViewById(R.id.imageSlider2);

        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel("https://tse2.mm.bing.net/th?id=OIP.v5HiFxxa7kAXvgBzXYG7UAHaDz&pid=Api&P=0&w=303&h=157","Image1"));
        slideModels.add(new SlideModel("https://tse1.mm.bing.net/th?id=OIP.P-eu9NciEM36KpC0svDIGAHaEK&pid=Api&P=0&w=280&h=158","Image2"));
        slideModels.add(new SlideModel("https://tse2.mm.bing.net/th?id=OIP.o7ikjeSvYM5XO8NJ48hzywHaE7&pid=Api&P=0&w=225&h=151","Image3"));
        slideModels.add(new SlideModel("https://tse2.mm.bing.net/th?id=OIP.o7ikjeSvYM5XO8NJ48hzywHaE7&pid=Api&P=0&w=225&h=151","Image4"));
        slider.setImageList(slideModels,true);
    }

    public void login(View view) {
        startActivity(new Intent(getApplicationContext(),LoginActivity.class));
    }

    public void signup(View view) {
        startActivity(new Intent(getApplicationContext(),RegisterActivity.class));
    }
}