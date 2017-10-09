package pe.edu.unsa.dutic.tutoapp;

import java.io.Serializable;

/**
 * Created by usuario on 02/10/2017.
 */

public class Datos implements Serializable{
    private int Id;
    private String Titulo;
    private String Descripcion;
    private int Imagen;

    public Datos(int id, String titulo, String descripcion, int imagen) {
        Id = id;
        Titulo = titulo;
        Descripcion = descripcion;
        Imagen = imagen;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }
}
