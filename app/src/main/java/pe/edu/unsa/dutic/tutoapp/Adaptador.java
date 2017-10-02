package pe.edu.unsa.dutic.tutoapp;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by usuario on 02/10/2017.
 */

public class Adaptador extends BaseAdapter {

    Context contexto;
    List<Datos> listaObjetos;

    public Adaptador(Context contexto, List<Datos> listaObjetos) {
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
        vista = inflate.inflate(R.layout.item_list_view_prueba, null);

        ImageView imagen = (ImageView)vista.findViewById(R.id.imgItemListViewn_Imagen);
        TextView titulo = (TextView)vista.findViewById(R.id.txtItemListView_Titulo);
        TextView descripcion = (TextView)vista.findViewById(R.id.txtItemListView_Descripcion);

        titulo.setText(listaObjetos.get(position).getTitulo().toString());
        descripcion.setText(listaObjetos.get(position).getDescripcion().toString());
        imagen.setImageResource(listaObjetos.get(position).getImagen());
        return vista;
    }
}
