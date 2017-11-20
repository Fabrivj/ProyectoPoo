package ac.cr.ucenfotec.capalogica;

public class Casos {

    private int num;
    private String descripcion;
    private Querellante acusador;
    private Juez juezEnc;
    private Historial listado;

    public Casos() {
    }

    public Casos(int num, String descripcion, Querellante acusador, Juez juezEnc, Historial listado) {
        this.num = num;
        this.descripcion = descripcion;
        this.acusador = acusador;
        this.juezEnc = juezEnc;
        this.listado = listado;
    }
   

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Querellante getAcusador() {
        return acusador;
    }

    public void setAcusador(Querellante acusador) {
        this.acusador = acusador;
    }

    public Juez getJuezEnc() {
        return juezEnc;
    }

    public void setJuezEnc(Juez juezEnc) {
        this.juezEnc = juezEnc;
    }

    public Historial getListado() {
        return listado;
    }

    public void setListado(Historial listado) {
        this.listado = listado;
    }

    @Override
    public String toString() {
        return "Casos: " + " " + num + " " + descripcion + " " + acusador + " " + juezEnc + " " + listado;
    }

}
