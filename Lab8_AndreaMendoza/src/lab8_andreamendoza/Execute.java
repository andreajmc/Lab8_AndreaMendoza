package lab8_andreamendoza;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Execute extends Thread {

    private Actividad act;
    private boolean avanzar;
    private boolean vive;
    private float inicio;
    private JTable T;
    public String estado = "";
    private int pos;

    public Execute(Actividad act, JTable T, int pos) {
        this.act = act;
        this.avanzar = true;
        this.vive = true;
        inicio = 0;
        this.estado = "En Espera.";
        this.T = T;
        this.pos = pos;
    }

    public Actividad getAct() {
        return act;
    }

    public void setAct(Actividad act) {
        this.act = act;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        DefaultTableModel m = (DefaultTableModel) T.getModel();

        while (vive) {
            if (avanzar) {
                while (inicio < act.getFinalt()) {
                    estado = "Ejecutando...";
                    m.setValueAt(estado, pos, 2);
                    T.setModel(m);
                    inicio += 0.001;
                    System.out.println(inicio);
                }
                estado = "Completado.";
                m.setValueAt(estado, pos, 2);
                T.setModel(m);
                ++pos;
                vive = false;
                stop();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
        }

    }

}
