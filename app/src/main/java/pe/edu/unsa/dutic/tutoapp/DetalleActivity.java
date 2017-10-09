package pe.edu.unsa.dutic.tutoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    TextView titulo;
    TextView detalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        titulo = (TextView)findViewById(R.id.txtTituloDetalle);
        detalle = (TextView)findViewById(R.id.txtDetallaDetalle);

        CourseData obj = (CourseData)getIntent().getExtras().getSerializable("Objeto");

        titulo.setText(obj.getNombre());
        detalle.setText(obj.getDescripcion());
    }
}
