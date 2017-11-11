package ac.cr.ucenfotec.bd;

public class ConectorBD {

    private static AccesoBD conectorBD = null;

    public static AccesoBD getConector() throws java.sql.SQLException, Exception {

        conectorBD = new AccesoBD("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/bd_proyecto_poo","root","");

        return conectorBD;
    }
}
