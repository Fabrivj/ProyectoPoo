package ac.cr.ucenfotec.capalogica;

import ac.cr.ucenfotec.bd.AccesoBD;
import ac.cr.ucenfotec.bd.ConectorBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MultiSecretario {

    public void registrarSecretario() throws SQLException, Exception {

        String sql;
        sql = "INSERT INTO secretarios "
                + "(id_persona,id_usuario) "
                + "VALUES ((" + "SELECT MAX(id_persona) FROM personas" + "),("
                + "SELECT MAX(id_usuario) FROM usuarios" + "));";
        AccesoBD conn = ConectorBD.getConector();
        conn.ejecutarSQL(sql);

    }

    public ArrayList getSecretarios() throws SQLException, Exception {
        String sql;
        ResultSet resultSet;
        ArrayList<Secretario> secretarios;
        secretarios = new ArrayList<>();
        sql = "SELECT * from secretarios s join personas p on s.id_persona= p.id_persona "
                + "join usuarios u on s.id_usuario= u.id_usuario;";
        resultSet = ConectorBD.getConector().ejecutarSQL(sql, true);
        while (resultSet.next()) {
            secretarios.add(new Secretario(resultSet.getString("nombre_usuario"),
                    resultSet.getString("clave"),
                    resultSet.getString("nombre"), resultSet.getString("apellidos"),
                    resultSet.getInt("telefono"), "S"));
        }
        return secretarios;
    }
}
