package ac.cr.ucenfotec.capalogica;

import ac.cr.ucenfotec.bd.AccesoBD;
import ac.cr.ucenfotec.bd.ConectorBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MultiQuerellante {

    public void registrarQuerellante(String direccion, int cedula) throws Exception {

        String sql;
        sql = "INSERT INTO querellantes "
                + "(direccion, cedula,id_persona) "
                + "VALUES ('" + direccion + "', '" + cedula + "',(" + "SELECT MAX(id_persona) FROM personas" + "));";

        AccesoBD conn = ConectorBD.getConector();
        conn.ejecutarSQL(sql);

    }

    public ArrayList getQuerellantes() throws Exception {
        String sql;
        ResultSet resultSet;
        ArrayList<Querellante> querellantes;
        querellantes = new ArrayList<>();
        sql = "SELECT * "
                + "from querellantes j join personas p on j.id_persona=p.id_persona;";
        resultSet = ConectorBD.getConector().ejecutarSQL(sql, true);
        while (resultSet.next()) {
            querellantes.add(new Querellante(resultSet.getString("direccion"),
                    resultSet.getInt("cedula"),
                    resultSet.getString("nombre"), resultSet.getString("apellidos"),
                    resultSet.getInt("telefono"), "Q"));
        }
        return querellantes;
    }

    public int idQuerellante(int cedula) throws SQLException, Exception {
        String sql;
        ResultSet resultSet;
        sql = "SELECT id_querellante" + "FROM querellantes" + "WHERE" + cedula + "=cedula;";
        resultSet = ConectorBD.getConector().ejecutarSQL(sql, true);
        while (resultSet.next()) {

            return resultSet.getInt("id_querellante");
            
        }

        return -1;
    }
}
