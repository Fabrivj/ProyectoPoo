package ac.cr.ucenfotec.capalogica;

import ac.cr.ucenfotec.bd.AccesoBD;
import ac.cr.ucenfotec.bd.ConectorBD;
import java.sql.*;

public class MultiUsuario {

    public MultiUsuario() {

    }

    public void registrarUsuario(String nombre, String clave) throws Exception {

        String sql;
        sql = "INSERT INTO usuarios "
                + "(nombre_usuario, clave) "
                + "VALUES ('" + nombre + "', '" + clave + "');";

        AccesoBD conn = ConectorBD.getConector();
        conn.ejecutarSQL(sql);

    }
}
