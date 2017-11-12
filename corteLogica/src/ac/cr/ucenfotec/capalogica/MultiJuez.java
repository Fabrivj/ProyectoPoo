package ac.cr.ucenfotec.capalogica;

import ac.cr.ucenfotec.bd.AccesoBD;
import ac.cr.ucenfotec.bd.ConectorBD;

public class MultiJuez {

    public MultiJuez() {
    }

    public void registrarJuez(String sala, int cedula) throws Exception {
        String sql;
        sql = "INSERT INTO jueces"
                + "(sala,cedula,id_persona,id_usuario)"
                + "VALUES('" + sala + "','" + cedula + "',(" + "SELECT MAX(id_persona) FROM personas" + "),("
                + "SELECT MAX(id_usuario) FROM usuarios" + "));";

        AccesoBD conn = ConectorBD.getConector();
        conn.ejecutarSQL(sql);

    }
}
