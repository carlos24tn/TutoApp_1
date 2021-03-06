package pe.edu.unsa.dutic.tutoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView listaDatos;
    //ArrayList<Datos> lista;
    ArrayList<CourseData> listaCursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listaDatos = (ListView)findViewById(R.id.lstvwPrincipal);

        listaCursos = new ArrayList<CourseData>();

        listaCursos.add(new CourseData(1, "CALCULO EN 1 VARIABLE", 10, "ffd"));
        listaCursos.add(new CourseData(1, "CALCULO EN 1 VARIABLE", 10, "ffd"));
        listaCursos.add(new CourseData(1, "CALCULO EN 1 VARIABLE", 10, "ffd"));
        listaCursos.add(new CourseData(1, "CALCULO EN 1 VARIABLE", 10, "ffd"));
        listaCursos.add(new CourseData(1, "CALCULO EN 1 VARIABLE", 103, "ffd"));
        listaCursos.add(new CourseData(1, "CALCULO EN 1 VARIABLE", 10, "ffd"));
        listaCursos.add(new CourseData(1, "CALCULO EN 1 VARIABLE", 10, "ffd"));
        listaCursos.add(new CourseData(1, "CALCULO EN 1 VARIABLE", 10, "ffd"));
        listaCursos.add(new CourseData(1, "CALCULO EN 1 VARIABLE", 103, "ffd"));
        listaCursos.add(new CourseData(1, "CALCULO EN 1 VARIABLE", 10, "ffd"));
        listaCursos.add(new CourseData(1, "ECUACIONES DIRERENCIALES ORDINARIAS ECUACIONES DIRERENCIALES ORDINARIAS ECUACIONES DIRERENCIALES ORDINARIAS", 103, "ffd"));
        listaCursos.add(new CourseData(1, "CALCULO EN 1 VARIBLE", 10, "ffd"));
        listaCursos.add(new CourseData(1, "CALCULO EN VARIAS VARIABLES", 10, "ffd"));
        listaCursos.add(new CourseData(1, "ECUACIONES DIFERENCIALES", 10, "ffd"));

        CourseAdapter miAdaptador = new CourseAdapter(getApplicationContext(), listaCursos);
        listaDatos.setAdapter(miAdaptador);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CourseData obj = (CourseData)parent.getItemAtPosition(position);
                Intent paso = new Intent(getApplicationContext(), DetalleActivity.class);
                paso.putExtra("Objeto", (Serializable)obj);
                startActivity(paso);
            }
        });

        /*lista = new ArrayList<Datos>();

        lista.add(new Datos(1,"Jaguar", "Animal",R.drawable.jaguar));
        lista.add(new Datos(1,"Jaguar", "Animal en peligro de extinsion",R.drawable.jaguar));
        lista.add(new Datos(1,"Jaguar", "Animal en peligro de extinsion",R.drawable.jaguar));
        lista.add(new Datos(1,"Jaguar", "Animal en peligro de extinsion",R.drawable.jaguar));
        lista.add(new Datos(1,"Jaguar", "Animal en peligro de extinsion",R.drawable.jaguar));
        lista.add(new Datos(1,"Jaguar", "Animal en peligro de extinsion",R.drawable.jaguar));
        lista.add(new Datos(1,"Jaguar", "Animal en peligro de extinsion",R.drawable.jaguar));
        lista.add(new Datos(1,"Jaguar", "Animal en peligro de extinsion",R.drawable.jaguar));


        Adaptador miAdaptador = new Adaptador(getApplicationContext(), lista);
        listaDatos.setAdapter(miAdaptador);*/





        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
