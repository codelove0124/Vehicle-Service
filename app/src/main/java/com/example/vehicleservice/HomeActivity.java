package com.example.vehicleservice;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.MenuItem;

import com.example.vehicleservice.HomeFragments.Booking;
import com.example.vehicleservice.HomeFragments.Home;
import com.example.vehicleservice.HomeFragments.Profile;
import com.example.vehicleservice.HomeFragments.Vehicle;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class HomeActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setupToolbar();


        Objects.requireNonNull(getSupportActionBar()).setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(listner);
        loadFrag(new Home());
    }
    public void setupToolbar() {
        drawerLayout = findViewById(R.id.drawerlayout);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        toggle.syncState();
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        toggle.onConfigurationChanged(newConfig);
    }
    NavigationView.OnNavigationItemSelectedListener listner=new NavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId())
            {
                case R.id.home:
                   loadFrag(new Home());
                    return true;
                case R.id.profile:
                    loadFrag(new Profile());
                    return true;
                case R.id.my_vehicles:
                    loadFrag(new Vehicle());
                    return true;
                case R.id.booking:
                    loadFrag(new Booking());
                    return true;
            }
            return false;
        }
    };

    private void loadFrag1(Fragment fragment) {

        if (fragment != null) {
            FragmentManager manager=getSupportFragmentManager();
            manager.beginTransaction().add(R.id.frame,fragment).commit();

        }
    }
    private void loadFrag(Fragment fragment) {

        if (fragment != null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frame, fragment, "tag");
            transaction.addToBackStack("tag").commit();
            drawerLayout.closeDrawers();
        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        int backStackEntryCount = getSupportFragmentManager().getBackStackEntryCount();

        if (backStackEntryCount == 0) {
            moveTaskToBack(true);

        }
    }

}