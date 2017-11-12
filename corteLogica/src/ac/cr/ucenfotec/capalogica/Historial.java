package ac.cr.ucenfotec.capalogica;

import java.time.LocalDate;


public class Historial {
    
    private int estado;
    private LocalDate fecha;

    public Historial() {
    }

    public Historial(int estado, LocalDate fecha) {
        this.estado = estado;
        this.fecha = fecha;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Historial: " + " " + estado + " " + fecha ;
    }
    
    
}
