package ac.cr.ucenfotec.capalogica;

public class Juez extends Persona {
    
    
    private String sala;
    private String usuario;
    private String clave;
    private int cedula;

    public Juez() {
        super();
    }

    public Juez(String sala, String usuario, String clave, int cedula, String nombre, String apellidos, int tel) {
        super(nombre, apellidos, tel);
        this.sala = sala;
        this.usuario = usuario;
        this.clave = clave;
        this.cedula = cedula;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Juez : " + " " + sala + " " + usuario + " " + clave + " " + cedula;
    }
    
    
    
    
}
