package com.isaacmiguelsg.tt.tuzo_time;

import android.app.Activity;
import android.app.*;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.MenuInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;
import com.isaacmiguelsg.tt.*;

import static com.isaacmiguelsg.tt.tuzo_time.R.layout.activity_main;

public class MainActivity extends AppCompatActivity /*

        implements NavigationView.OnNavigationItemSelectedListener */{
    FragmentManager fm = getFragmentManager();

    public WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        Intent i = new Intent(this, Foro.class);
        startActivity(i);
/*


        FragmentManager fm = getFragmentManager();
        //fm.beginTransaction().replace(R.id.frame, new MainActivity()).commit();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        WebView myWebView = (WebView) findViewById(R.id.webView);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        myWebView.loadUrl("http://p-tuzobus.hidalgo.gob.mx/mapa/mapa.html");
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main_drawer, menu);
        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.Mapa) {

        } else if (id == R.id.Horario) {

        } else if (id == R.id.Troncal) {

        } else if (id == R.id.Alimentadora) {

        } else if (id == R.id.QuejasYSugerencias) {

        } else if (id == R.id.Foro) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(null, "Se está ejecutando", Toast.LENGTH_SHORT).show();
        boolean FragmentTransation = false;/*
        switch (item.getItemId()) {
            case R.id.Mapa:
                fm.beginTransaction().replace(R.id.frame, new activity_main()).commit();
                break;
            case R.id.Troncal:
                fm.beginTransaction().replace(R.id.frame, new HorarioTroncal()).commit();
                break;
            case R.id.Alimentadora:
                fm.beginTransaction().replace(R.id.frame, new HorarioAlimentadora()).commit();
                break;
            case R.id.QuejasYSugerencias:
                fm.beginTransaction().replace(R.id.frame, new QuejasSugerencias()).commit();
                break;
            case R.id.Foro:
                fm.beginTransaction().replace(R.id.frame, new Foro()).commit();
                break;
        }
        return true;*/
    }

}