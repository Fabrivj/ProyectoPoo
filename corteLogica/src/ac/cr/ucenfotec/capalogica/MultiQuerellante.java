package ac.cr.ucenfotec.capalogica;

import ac.cr.ucenfotec.bd.AccesoBD;
import ac.cr.ucenfotec.bd.ConectorBD;
import java.sql.ResultSet;

public class MultiQuerellante {

    public void registrarQuerellante(String direccion, int cedula) throws Exception {

        String sql;
        sql = "INSERT INTO querellantes "
                + "(direccion, cedula,id_persona) "
                + "VALUES ('" + direccion + "', '" + cedula + "',(" + "SELECT MAX(id_persona) FROM personas" + "));";

        AccesoBD conn = ConectorBD.getConector();
        conn.ejecutarSQL(sql);

    }

    public String listarQuerellantes() throws Exception {
        String datos = null;//Selects generales
        String sql;
        ResultSet resultSet;
        sql = "SELECT * FROM querellantes WHERE id_querellante=2";

        AccesoBD conn = ConectorBD.getConector();
        conn.ejecutarSQL(sql);
        resultSet = ConectorBD.getConector().ejecutarSQL(sql, true);
        while (resultSet.next()) {
            datos = resultSet.getString("direccion");
        }

        return datos;
    }
}
