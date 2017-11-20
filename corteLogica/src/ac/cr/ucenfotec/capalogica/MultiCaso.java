package ac.cr.ucenfotec.capalogica;

import ac.cr.ucenfotec.bd.AccesoBD;
import ac.cr.ucenfotec.bd.ConectorBD;
import java.sql.SQLException;

public class MultiCaso {

    public void registrarCaso(int num, String descripcion, int idQuerellante, int idJuez) throws SQLException, Exception {

        String sql;
        sql = "INSERT INTO casos "
                + "(numero,descripcion,id_querellante,id_juez,id_hiatorial) "
                + "VALUES('" + num + "','" + descripcion + "','" + idQuerellante + "','"
                + idJuez + "',(" + "SELECT MAX(id_historial) FROM historiales" + "));";
        AccesoBD conn = ConectorBD.getConector();
        conn.ejecutarSQL(sql);

    }
}
