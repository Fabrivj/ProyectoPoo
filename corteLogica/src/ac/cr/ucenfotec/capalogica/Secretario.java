package ac.cr.ucenfotec.capalogica;

public class Secretario extends Persona {

    private String usuario;
    private String clave;

    public Secretario() {
        super();
    }

    public Secretario(String usuario, String clave, String nombre, String apellidos, int tel) {
        super(nombre, apellidos, tel);
        this.usuario = usuario;
        this.clave = clave;
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

    @Override
    public String toString() {
        return "Secretario: " + " " + usuario + " " + clave;
    }

}
