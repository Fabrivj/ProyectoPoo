package ac.cr.ucenfotec.capalogica;

import java.time.LocalDate;

public class Historial {

    private int historialEstado;

    public Historial() {
    }

    public Historial(int estado) {
        this.historialEstado = estado;

    }

    public int getEstado() {
        return historialEstado;
    }

    public void setEstado(int estado) {
        this.historialEstado = estado;
    }

    @Override
    public String toString() {
        return "Historial: " + " " + historialEstado;
    }

}
