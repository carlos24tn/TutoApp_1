package pe.edu.unsa.dutic.tutoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

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

        TextView nombreTema = (TextView)vista.findViewById(R.id.txtItemListViewTutors_NombreTema);
        TextView nombreDocente = (TextView)vista.findViewById(R.id.txtItemListViewTutors_NombreDocente);
        TextView tipo = (TextView)vista.findViewById(R.id.txtItemListViewTutors_TipoTutor);
        TextView escuela = (TextView)vista.findViewById(R.id.txtItemListViewTutors_EscuelaTutor);
        TextView horario = (TextView)vista.findViewById(R.id.txtItemListViewTutors_HorarioTutor);

        nombreTema.setText(listaTutor.get(position).getTema().toString());
        nombreDocente.setText(listaTutor.get(position).getNombre().toString()+listaTutor.get(position).getApellido());
        tipo.setText("Docente");
        escuela.setText("Escuela Profesional de Ingeniería en Industrias Alimentarias");
        horario.setText(listaTutor.get(position).getFechaInicio().toString());

        //Falta que se va a mostrar


        return vista;
    }
}
