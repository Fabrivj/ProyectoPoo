package ac.cr.ucenfotec.capalogica;


public class Persona {
    
    protected String nombre;
    protected String apellidos;
    protected int tel;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, int tel) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tel = tel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Persona : " + " " + nombre + " " + apellidos + " " + tel ;
    }
    
    
    
    
}
