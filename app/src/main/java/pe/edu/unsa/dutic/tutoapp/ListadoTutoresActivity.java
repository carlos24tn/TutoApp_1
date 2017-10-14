package pe.edu.unsa.dutic.tutoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

public class ListadoTutoresActivity extends AppCompatActivity {

    TextView titulo;

    ListView listaDatos;
    ArrayList<TutorData> listaTutores;
    //ArrayList

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_tutores);

        this.mostrarTituloCurso();
        this.mostrarListaTutores();



    }

    private void mostrarTituloCurso(){
        titulo = (TextView)findViewById(R.id.txtActivityListadoTutores_Titulo);
        CourseData obj = (CourseData)getIntent().getExtras().getSerializable("Objeto");
        titulo.setText(obj.getNombre());
    }

    private void mostrarListaTutores(){
        listaDatos = (ListView) findViewById(R.id.lstvwTutores);
        listaTutores = new ArrayList<>();

        ArrayList<String> telefonos = new ArrayList<>();
        telefonos.add("999224177");
        ArrayList<String> herramientas = new ArrayList<>();
        herramientas.add("Calculadora");
        listaTutores.add(new TutorData(1,"Carlos Alberto", "Torres Naira",
                        "ctorresnaira@gmail.com", telefonos,
                "Integrales", new Date(2017,11,1), new Date(2017,11,2), "EPIS",
                herramientas));
        listaTutores.add(new TutorData(1,"Carlos Alberto", "Torres Naira",
                "ctorresnaira@gmail.com", telefonos,
                "Integrales", new Date(2017,11,1), new Date(2017,11,2), "EPIS",
                herramientas));
        listaTutores.add(new TutorData(1,"Carlos Alberto", "Torres Naira",
                "ctorresnaira@gmail.com", telefonos,
                "Integrales", new Date(2017,11,1), new Date(2017,11,2), "EPIS",
                herramientas));
        listaTutores.add(new TutorData(1,"Carlos Alberto", "Torres Naira",
                "ctorresnaira@gmail.com", telefonos,
                "Integrales", new Date(2017,11,1), new Date(2017,11,2), "EPIS",
                herramientas));
        listaTutores.add(new TutorData(1,"Carlos Alberto", "Torres Naira",
                "ctorresnaira@gmail.com", telefonos,
                "Integrales", new Date(2017,11,1), new Date(2017,11,2), "EPIS",
                herramientas));
        listaTutores.add(new TutorData(1,"Carlos Alberto", "Torres Naira",
                "ctorresnaira@gmail.com", telefonos,
                "Integrales", new Date(2017,11,1), new Date(2017,11,2), "EPIS",
                herramientas));

        TutorAdapter miAdapatador = new TutorAdapter(getApplicationContext(), listaTutores);
        listaDatos.setAdapter(miAdapatador);
    }
}
