package ac.cr.ucenfotec.capalogica;

import ac.cr.ucenfotec.bd.AccesoBD;
import ac.cr.ucenfotec.bd.ConectorBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class MultiHistorial {

    public void registrarHistorial(int estado) throws SQLException, Exception {

        String sql;
        sql = "INSERT INTO historiales "
                + "(id_historial,id_caso,estado) "
                + "VALUES ((" + "SELECT MAX(id_persona) FROM personas" + "),("
                + "SELECT MAX(id_usuario) FROM usuarios" + "),'" + estado + "');";

        AccesoBD conn = ConectorBD.getConector();
        conn.ejecutarSQL(sql);

    }

    public void registrarCasoHistorial(LocalDate fecha, int estado) throws SQLException, Exception {
        String sql;
        sql = "INSERT INTO historiales "
                + "(fecha,id_historial,id_caso,historial_estado) "
                + "VALUES('" + fecha + "',(" + "SELECT MAX(id_historial) FROM historiales" + "),"
                + "(" + "SELECT MAX(id_caso) FROM casos" + "),'" + estado + "');";
        AccesoBD conn = ConectorBD.getConector();
        conn.ejecutarSQL(sql);
    }

    public ArrayList getHistoriales() throws Exception {
        String sql;
        ResultSet resultSet;
        ArrayList<Historial> historiales;
        historiales = new ArrayList<>();
        sql = "SELECT * "
                + "from historiles;";
        resultSet = ConectorBD.getConector().ejecutarSQL(sql, true);
        while (resultSet.next()) {
            historiales.add(new Historial(resultSet.getInt("estado")));
        }
        return historiales;
    }
}
