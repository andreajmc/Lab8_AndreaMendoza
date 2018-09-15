package lab8_andreamendoza;

import java.util.ArrayList;

public class Actividad {

    private String nombre;
    private int inicio;
    private int duracion;
    private int finalt;
    private ArrayList<Actividad> before = new ArrayList();
    private ArrayList<Actividad> after = new ArrayList();
    private int retraso;
private Proyecto owner;

    public Actividad(String nombre, int duracion, int retraso, Proyecto owner) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.retraso = retraso;
        setInicio();
        setFinalt();
        this.owner = owner;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio() {
        if (before.isEmpty()) {
            this.inicio = 1;
        } else {
            int finalmayor = 0;
            for (Actividad act : before) {
                if (act.getFinalt() > finalmayor) {
                    finalmayor = act.getFinalt();
                }
            }
            this.inicio = finalmayor + 1;
        }
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getFinalt() {
        return finalt;
    }

    public void setFinalt() {
        this.finalt = this.inicio + this.duracion -1;
    }

    public ArrayList<Actividad> getBefore() {
        return before;
    }

    public void setBefore(ArrayList<Actividad> before) {
        this.before = before;
    }

    public ArrayList<Actividad> getAfter() {
        return after;
    }

    public void setAfter(ArrayList<Actividad> after) {
        this.after = after;
    }
    
    public int getRetraso() {
        return retraso;
    }

    public void setRetraso(int retraso) {
        this.retraso = retraso;
    }

    public void addActA(Actividad a) {
        this.after.add(a);
    }

    public void addActB(Actividad a) {
        this.before.add(a);
        setInicio();
        setFinalt();
    }

    public Proyecto getOwner() {
        return owner;
    }

    public void setOwner(Proyecto owner) {
        this.owner = owner;
    }
    
    @Override
    public String toString() {
        return nombre;
    }

}
