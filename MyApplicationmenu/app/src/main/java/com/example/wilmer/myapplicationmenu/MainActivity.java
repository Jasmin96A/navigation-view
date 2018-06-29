package com.example.wilmer.myapplicationmenu;

import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import android.support.v4.widget.DrawerLayout;
import android.support.design.widget.NavigationView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        navView = (NavigationView)findViewById(R.id.navview);
        navView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        boolean fragmentTransaction = false;
                        Fragment fragment = null;
                        switch (menuItem.getItemId()) {
                            case R.id.menu_seccion_1:
                                Toast.makeText(MainActivity.this, "Clic menu_seccion_1", Toast.LENGTH_SHORT).show();
                                Log.i("ActionBar", "Nuevo!");
                                //fragment = new Fragment1();
                                //fragmentTransaction = true;
                                break;
                            case R.id.menu_seccion_2:
                                Toast.makeText(MainActivity.this, "Clic menu_seccion_2", Toast.LENGTH_SHORT).show();
                                Log.i("ActionBar", "Nuevo!");
                                //fragment = new Fragment2();
                                //fragmentTransaction = true;
                                break;
                            case R.id.menu_seccion_3:
                                Toast.makeText(MainActivity.this, "Clic menu_seccion_3", Toast.LENGTH_SHORT).show();
                                Log.i("ActionBar", "Nuevo!");
                                // fragment = new Fragment3();
                                // fragmentTransaction = true;
                                break;
                            case R.id.menu_opcion_1:
                                Toast.makeText(MainActivity.this, "Clic menu_opcion_1", Toast.LENGTH_SHORT).show();
                                Log.i("ActionBar", "Nuevo!");
                                // fragment = new Fragment3();
                                // fragmentTransaction = true;
                                break;
                            case R.id.menu_opcion_2:
                                Toast.makeText(MainActivity.this, "Clic menu_opcion_2", Toast.LENGTH_SHORT).show();
                                Log.i("ActionBar", "Nuevo!");
                                // fragment = new Fragment3();
                                // fragmentTransaction = true;
                                break;
                        }
                        if(fragmentTransaction) {
                            getSupportFragmentManager().beginTransaction()
                                    .replace(R.id.content_frame, fragment)
                                    .commit();
                            menuItem.setChecked(true);
                            getSupportActionBar().setTitle(menuItem.getTitle());
                        }
                        drawerLayout.closeDrawers();
                        return true;
                    }
                });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu  menu) {
        getMenuInflater().inflate(R.menu.menu , menu);
        return true;
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_nuevo:
                Toast.makeText(MainActivity.this, "Clic sobre el boton Nuevo", Toast.LENGTH_SHORT).show();
                Log.i("ActionBar", "Nuevo!");
                return true;
            case R.id.action_buscar:
                Toast.makeText(MainActivity.this, "Clic sobre el boton Buscar", Toast.LENGTH_SHORT).show();
                Log.i("ActionBar", "Buscar!");;
                return true;
            case R.id.action_settings:
                Toast.makeText(MainActivity.this, "Clic sobre el boton Setting", Toast.LENGTH_SHORT).show();
                Log.i("ActionBar", "Settings!");;
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }*/
    public void onClickFAB(View view) {
        Snackbar.make(view, "Se presionó el FAB", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    DrawerLayout drawerLayout;
    NavigationView navView;
    public void Fragment1()
    {

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
                drawerLayout.openDrawer(GravityCompat.START);
        return true;
        default:
            return super.onOptionsItemSelected(item);
        }

    }




}
