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
                + "(nombre_usuario, clave) "
                + "VALUES ('" + nombre + "', '" + clave + "','" + rol + "');";

        AccesoBD conn = ConectorBD.getConector();
        conn.ejecutarSQL(sql);

    }
    
    public String  validarCredenciales(String usuario, String clave) throws Exception{
        String datos = null;
        String sql;
        ResultSet resultSet;
        sql = ("(SELECT rol FROM usuarios WHERE nombre_usuario = " +usuario+", clave="+clave+");")";

        AccesoBD conn = ConectorBD.getConector();
        conn.ejecutarSQL(sql);
        resultSet = ConectorBD.getConector().ejecutarSQL(sql, true);
        while (resultSet.next()) {
            datos = resultSet.getString("direccion");
        }
    
   
    return datos;
    }
}
