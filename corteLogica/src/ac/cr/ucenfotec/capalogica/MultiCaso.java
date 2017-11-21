package ac.cr.ucenfotec.capalogica;

import ac.cr.ucenfotec.bd.AccesoBD;
import ac.cr.ucenfotec.bd.ConectorBD;
import java.sql.SQLException;

public class MultiCaso {

    public void registrarCaso(int num, String descripcion, int idQuerellante, int idJuez) throws SQLException, Exception {

        String sql;
        sql = "INSERT INTO casos "
                + "(numero,descripcion,id_querellante,id_juez) "
                + "VALUES('" + num + "','" + descripcion + "','" + idQuerellante + "','"
                + idJuez + "');";
        AccesoBD conn = ConectorBD.getConector();
        conn.ejecutarSQL(sql);

    }
}
