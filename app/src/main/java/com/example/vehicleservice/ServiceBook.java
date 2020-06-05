package com.example.vehicleservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ServiceBook extends AppCompatActivity {
    TextView title;
    ImageView pic;
    int i;
    String t,type;

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
        type=b.getString("type");
        title.setText(t);
        pic.setBackgroundResource(i);

    }

    public void book(View view) {

        if (type.equals("car"))
        {
            Bundle bundle=new Bundle();
            bundle.putInt("pic",R.drawable.car);
            Intent i1=new Intent(getApplicationContext(),AddVehicle.class);
            i1.putExtras(bundle);
            startActivity(i1);
        }
        else if (type.equals("bike"))
        {
            Bundle bundle=new Bundle();
            bundle.putInt("pic",R.drawable.bike);
            Intent i1=new Intent(getApplicationContext(),AddVehicle.class);
            i1.putExtras(bundle);
            startActivity(i1);
        }

    }
}