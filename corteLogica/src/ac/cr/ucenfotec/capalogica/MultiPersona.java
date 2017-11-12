package ac.cr.ucenfotec.capalogica;

import ac.cr.ucenfotec.bd.AccesoBD;
import ac.cr.ucenfotec.bd.ConectorBD;

public class MultiPersona {

    public MultiPersona() {
    }

    public void registrarPersona(String nombre, String apellidos, int tel) throws Exception {
        String sql;
        sql = "INSERT INTO personas"
                + "(nombre,apellidos,telefono)"
                + "VALUES('" + nombre + "', '" + apellidos + "','" + tel + "');";
        AccesoBD conn = ConectorBD.getConector();
        conn.ejecutarSQL(sql);        
    }

}
