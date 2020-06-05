package com.example.vehicleservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public class AddVehicle extends AppCompatActivity {

    ImageView i1;
    Bundle bundle;
    int type;
    MaterialBetterSpinner manufacture,model;
    TextInputEditText regno;
    String[] manu={"Abarth","Ashok Leyland","Aston Martin","Audi","Bajaj","BMW","Bugatti","DC","Datsun","Ferrari","Fiat","Force","Ford"};
    String[] mod1={"Accent","Elite i20"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_vehicle);
        i1=findViewById(R.id.i1);
        manufacture=findViewById(R.id.manufacture);
        model=findViewById(R.id.model);
        Intent intent=getIntent();
        bundle=intent.getExtras();
        type=bundle.getInt("pic");
        i1.setImageResource(type);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,manu);
        manufacture.setAdapter(adapter);

        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,mod1);
        model.setAdapter(adapter1);

    }

    public void addVehicle(View view) {
    }
}