package ac.cr.ucenfotec.capalogica;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Gestor {
    //Multis no pueden ser globales

    MultiUsuario nuevoUsuario = new MultiUsuario();
    MultiPersona nuevaPer = new MultiPersona();
    MultiJuez nuevoJuez = new MultiJuez();
    MultiQuerellante nuevoQuere = new MultiQuerellante();
    MultiSecretario nuevoSec = new MultiSecretario();
    MultiCaso nuevoCaso = new MultiCaso();
    MultiHistorial nuevoHisto= new MultiHistorial();
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

    public void registrarCaso(int num, String descripcion, Querellante acusador) throws Exception {
        int idQuerellante = getIdQuerellante(acusador);
        int idJuez = getIdJuez(buscarJuez());
        nuevoHisto.registrarHistorial(1);
        nuevoCaso.registrarCaso(num, descripcion, idQuerellante, idJuez);
        nuevoHisto.registrarCasoHistorial(LocalDate.MIN,1);
    }

    public int getIdQuerellante(Querellante acusador) throws Exception {

        return nuevoQuere.idQuerellante(acusador.getCedula());
    }

    public int getIdJuez(Juez juezEnc) throws Exception {

        return nuevoJuez.idJuez(juezEnc.getCedula());
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

    public Querellante buscarQuerellante(int pCedula) throws Exception {
        ArrayList<Querellante> listaQuerellante = nuevoQuere.getQuerellantes();
        Querellante result = null;

        for (Querellante actQuere : listaQuerellante) {

            if (actQuere.getCedula() == pCedula) {
                result = actQuere;
                break;
            }
        }
        return result;
    }

    public Juez buscarJuez() throws Exception {
        ArrayList<Juez> listaJueeces = nuevoJuez.getJuez();
        Juez result = null;

        int range = (listaJueeces.size() - 0);
        int index = (int) (Math.random() * range) + 0;
        result = listaJueeces.get(index);

        return result;
    }

}
