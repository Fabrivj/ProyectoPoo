package ac.cr.ucenfotec.capalogica;

import java.time.LocalDate;


public class Historial {
    
    private int historialEstado;
    private LocalDate fecha;

    public Historial() {
    }

    public Historial(int estado, LocalDate fecha) {
        this.historialEstado = estado;
        this.fecha = fecha;
    }

    public int getEstado() {
        return historialEstado;
    }

    public void setEstado(int estado) {
        this.historialEstado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Historial: " + " " + historialEstado + " " + fecha ;
    }
    
    
}
