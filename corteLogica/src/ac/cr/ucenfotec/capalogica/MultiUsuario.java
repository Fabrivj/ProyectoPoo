package ac.cr.ucenfotec.capalogica;

import ac.cr.ucenfotec.bd.AccesoBD;
import ac.cr.ucenfotec.bd.ConectorBD;
import java.sql.*;

public class MultiUsuario {

    public MultiUsuario() {

    }

    public void registrarUsuario(String nombre, String clave, char rol) throws Exception {

        String sql;
        sql = "INSERT INTO usuarios "
                + "(nombre_usuario, clave,rol) "
                + "VALUES ('" + nombre + "', '" + clave + "','" + rol + "');";

        AccesoBD conn = ConectorBD.getConector();
        conn.ejecutarSQL(sql);

    }

}
