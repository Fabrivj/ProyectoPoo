package ac.cr.ucenfotec.capalogica;

public class Gestor {

    MultiUsuario nuevoUsuario = new MultiUsuario();
    MultiPersona nuevaPer = new MultiPersona();
    MultiJuez nuevoJuez = new MultiJuez();
    MultiQuerellante nuevoQuere = new MultiQuerellante();

    public void registrarJuez(String nombre, String apellidos, int tel,
            String usuario, String clave, String sala, int cedula) throws Exception {

        nuevaPer.registrarPersona(nombre, apellidos, tel);
        nuevoUsuario.registrarUsuario(usuario, clave,'J');
        nuevoJuez.registrarJuez(sala, cedula);

    }

    public void registrarQuerellante(String direccion, int cedula, String nombre, String apellidos, int tel) throws Exception {
        nuevaPer.registrarPersona(nombre, apellidos, tel);
        nuevoQuere.registrarQuerellante(direccion, cedula);

    }
    public void login(String usuario, String clave){
        
       
    }

}
