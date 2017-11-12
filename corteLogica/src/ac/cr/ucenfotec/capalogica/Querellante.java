package ac.cr.ucenfotec.capalogica;

public class Querellante extends Persona {

    private String direccion;
    private int cedula;

    public Querellante() {
        super();
    }

    public Querellante(String direccion, int cedula, String nombre, String apellidos, int tel) {
        super(nombre, apellidos, tel);
        this.direccion = direccion;
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Querellante: " + " " + direccion + " " + cedula;
    }
    
    

}
