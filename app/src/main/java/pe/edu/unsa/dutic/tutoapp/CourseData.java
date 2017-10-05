package pe.edu.unsa.dutic.tutoapp;

/**
 * Created by usuario on 05/10/2017.
 */

public class CourseData {
    private int Id;
    private String Nombre;
    private int Cantidad;
    private String Descripcion;

    public CourseData(int id, String nombre, int cantidad, String descripcion) {
        Id = id;
        Nombre = nombre;
        Cantidad = cantidad;
        Descripcion = descripcion;
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

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
