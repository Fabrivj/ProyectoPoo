package ac.cr.ucenfotec.capalogica;

import ac.cr.ucenfotec.bd.AccesoBD;
import ac.cr.ucenfotec.bd.ConectorBD;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

    public ArrayList getJuez() throws Exception {
        String sql;
        ResultSet resultSet;
        CallableStatement callableStatement;
        ArrayList<Juez> jueces;
        jueces = new ArrayList<>();
        sql = "SELECT * "
                + "from jueces j join personas p on j.id_persona=p.id_persona "
                + "join usuarios u ON j.id_usuario=u.id_usuario;";
        resultSet = ConectorBD.getConector().ejecutarSQL(sql, true);
        while (resultSet.next()) {
            jueces.add(new Juez(resultSet.getString("sala"),
                    resultSet.getString("nombre_usuario"),
                    resultSet.getString("clave"), resultSet.getInt("cedula"),
                    resultSet.getString("nombre"), resultSet.getString("apellidos"),
                    resultSet.getInt("telefono"), resultSet.getString("rol")));
        }
        return jueces;
    }

    public int idJuez(int cedula) throws SQLException, Exception {
        String sql;
        ResultSet resultSet;
        sql = "SELECT id_juez" + "FROM jueces" + "WHERE" + cedula + "=cedula;";
        resultSet = ConectorBD.getConector().ejecutarSQL(sql, true);
        while (resultSet.next()) {

            return resultSet.getInt("id_juez");

        }

        return -1;
    }
}
