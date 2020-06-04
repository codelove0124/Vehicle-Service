package com.example.vehicleservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ServiceBook extends AppCompatActivity {
    TextView title;
    ImageView pic;
    int i;
    String t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_book);
        pic=findViewById(R.id.picture);
        title=findViewById(R.id.title1);
        Intent intent=getIntent();
        Bundle b=intent.getExtras();
        i=b.getInt("picture");
        t=b.getString("title");
        title.setText(t);
        pic.setBackgroundResource(i);

    }
}