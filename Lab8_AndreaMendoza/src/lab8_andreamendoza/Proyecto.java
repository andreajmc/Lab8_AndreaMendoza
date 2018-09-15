package lab8_andreamendoza;

import java.util.ArrayList;

public class Proyecto {

private int duracion;
private String nombre;
private ArrayList <Actividad> Actividades;
private ArrayList <Actividad> All;

    public Proyecto(String nombre) {
        this.duracion = 0;
        this.nombre = nombre;
        this.Actividades = new ArrayList();
        this.All = new ArrayList();
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Actividad> getActividades() {
        return Actividades;
    }

    public void setActividades(ArrayList<Actividad> Actividades) {
        this.Actividades = Actividades;
    }
    
    public void addAct (Actividad a) {
        this.Actividades.add(a);
    }
    
    public void addact (Actividad a) {
        this.All.add(a);
    }

    public ArrayList<Actividad> getAll() {
        return All;
    }
    
    

    @Override
    public String toString() {
        return nombre;
    }
    
    



}
