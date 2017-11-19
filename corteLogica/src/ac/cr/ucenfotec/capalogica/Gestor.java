package ac.cr.ucenfotec.capalogica;

import java.util.ArrayList;

public class Gestor {

    MultiUsuario nuevoUsuario = new MultiUsuario();
    MultiPersona nuevaPer = new MultiPersona();
    MultiJuez nuevoJuez = new MultiJuez();
    MultiQuerellante nuevoQuere = new MultiQuerellante();
    MultiSecretario nuevoSec = new MultiSecretario();
    ArrayList<Juez> jueces = new ArrayList<>();
    ArrayList<Secretario> secretarios = new ArrayList<>();
    ArrayList<Querellante> querellantes = new ArrayList<>();

    public void registrarJuez(String nombre, String apellidos, int tel,
            String usuario, String clave, String sala, int cedula) throws Exception {

        nuevaPer.registrarPersona(nombre, apellidos, tel);
        nuevoUsuario.registrarUsuario(usuario, clave, 'J');
        nuevoJuez.registrarJuez(sala, cedula);

    }

    public void registrarQuerellante(String direccion, int cedula, String nombre, String apellidos, int tel) throws Exception {
        nuevaPer.registrarPersona(nombre, apellidos, tel);
        nuevoQuere.registrarQuerellante(direccion, cedula);

    }

    public void registrarSecretario(String usuario, String clave, String nombre, String apellidos, int tel, char rol) throws Exception {
        nuevaPer.registrarPersona(nombre, apellidos, tel);
        nuevoUsuario.registrarUsuario(usuario, clave, rol);
        nuevoSec.registrarSecretario();

    }

    public char login(String usuario, String clave) throws Exception {
        jueces = nuevoJuez.getJuez();
        secretarios = nuevoSec.getSecretarios();
        querellantes = nuevoQuere.getQuerellantes();
        for (Juez actJuez : jueces) {
            if (actJuez.getUsuario().equals(usuario) || actJuez.getClave().equals(clave)) {
                return 'J';
            }
        }
        for (Secretario actSec : secretarios) {
            if (actSec.getUsuario().equals(usuario) || actSec.getClave().equals(clave)) {
                return 'S';
            }
        }
        for (Querellante actQuere : querellantes) {
            if (actQuere.getCedula() == Integer.parseInt(usuario)) {
                return 'Q';
            }
        }

        return 'N';
    }

}
