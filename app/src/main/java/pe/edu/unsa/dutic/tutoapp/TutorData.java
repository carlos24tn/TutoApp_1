package pe.edu.unsa.dutic.tutoapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by usuario on 12/10/2017.
 */

public class TutorData implements Serializable{
    private int Id;
    private String Nombre;
    private String Apellido;
    private String Email;
    private ArrayList<String> ListaTelefono;
    private String tema;
    private Date fechaInicio;
    private Date fechaFin;
    private String Lugar;
    private ArrayList<String> ListaMaterial;

    public TutorData(int id, String nombre, String apellido, String email, ArrayList<String> listaTelefono, String tema, Date fechaInicio, Date fechaFin, String lugar, ArrayList<String> listaMaterial) {
        Id = id;
        Nombre = nombre;
        Apellido = apellido;
        Email = email;
        ListaTelefono = listaTelefono;
        this.tema = tema;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        Lugar = lugar;
        ListaMaterial = listaMaterial;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public ArrayList<String> getListaTelefono() {
        return ListaTelefono;
    }

    public void setListaTelefono(ArrayList<String> listaTelefono) {
        ListaTelefono = listaTelefono;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }

    public ArrayList<String> getListaMaterial() {
        return ListaMaterial;
    }

    public void setListaMaterial(ArrayList<String> listaMaterial) {
        ListaMaterial = listaMaterial;
    }
}
