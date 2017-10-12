package pe.edu.unsa.dutic.tutoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by usuario on 12/10/2017.
 */

public class TutorAdapter extends BaseAdapter{

    Context contexto;
    List<TutorData> listaTutor;

    public TutorAdapter(Context contexto, List<TutorData> listaTutor) {
        this.contexto = contexto;
        this.listaTutor = listaTutor;
    }

    @Override
    public int getCount() {
        return this.listaTutor.size();
    }

    @Override
    public Object getItem(int position) {
        return this.listaTutor.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.listaTutor.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = convertView;

        LayoutInflater inflate = LayoutInflater.from(contexto);
        vista = inflate.inflate(R.layout.item_list_view_tutors, null);

        //Falta que se va a mostrar


        return null;
    }
}
