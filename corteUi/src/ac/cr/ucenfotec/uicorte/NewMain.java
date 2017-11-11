package ac.cr.ucenfotec.uicorte;

import ac.cr.ucenfotec.capalogica.MultiUsuario;
import java.sql.SQLException;

public class NewMain {

    public static void main(String[] args) throws Exception {

        try {
            MultiUsuario newUser = new MultiUsuario();
            newUser.crearUsuario("Fabricio", "1234");
            System.out.println("Insertado");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
