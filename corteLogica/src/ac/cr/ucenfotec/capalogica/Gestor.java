package ac.cr.ucenfotec.capalogica;

public class Gestor {


    public  void registrarJuez(String nombre, String apellidos, int tel,
            String usuario, String clave, String sala, int cedula) throws Exception 
    {
        MultiUsuario nuevoUsuario = new MultiUsuario();
        MultiPersona nuevaPer = new MultiPersona();
        MultiJuez nuevoJuez = new MultiJuez();
        nuevaPer.registrarPersona(nombre, apellidos, tel);
        nuevoUsuario.registrarUsuario(usuario, clave);
        nuevoJuez.registrarJuez(sala, cedula);

    }

}
