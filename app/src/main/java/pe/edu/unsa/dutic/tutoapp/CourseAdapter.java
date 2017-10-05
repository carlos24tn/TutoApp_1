package pe.edu.unsa.dutic.tutoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by usuario on 05/10/2017.
 */

public class CourseAdapter extends BaseAdapter{

    Context contexto;
    List<CourseData> listaObjetos;

    public CourseAdapter(Context contexto, List<CourseData> listaObjetos) {
        this.contexto = contexto;
        this.listaObjetos = listaObjetos;
    }

    @Override
    public int getCount() {
        // Retorna cantidad de elementos en la lista
        return this.listaObjetos.size();
    }

    @Override
    public Object getItem(int position) {
        return this.listaObjetos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.listaObjetos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = convertView;

        LayoutInflater inflate = LayoutInflater.from(contexto);
        vista = inflate.inflate(R.layout.item_list_view_course, null);

        TextView Nombre = (TextView)vista.findViewById(R.id.txtItemListViewCourse_NombreCurso);
        TextView Cantidad = (TextView)vista.findViewById(R.id.txtItemListViewCourse_CantidadCurso);

        Nombre.setText(listaObjetos.get(position).getNombre().toString());

        String cantidadTexto;
        if(listaObjetos.get(position).getCantidad() > 99){
            cantidadTexto = "99+";
        }else {
            cantidadTexto = String.valueOf(listaObjetos.get(position).getCantidad());
        }
        Cantidad.setText(cantidadTexto);

        return vista;
    }
}
