package pe.edu.unsa.dutic.tutoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListadoTutoresActivity extends AppCompatActivity {

    ListView dataList;
    //ArrayList

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_tutores);
    }
}
