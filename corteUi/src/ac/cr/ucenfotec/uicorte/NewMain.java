package ac.cr.ucenfotec.uicorte;

import ac.cr.ucenfotec.capalogica.Gestor;
import java.sql.SQLException;

public class NewMain {

    public static void main(String[] args) throws Exception {
        //MAIN DE PRUEBA NO UTILIZAR
        Gestor nuevoGes = new Gestor();
        try {

            nuevoGes.registrarJuez("Jose", "Cedeño", 87884400,
                    "Jose45", "1122", "Sala2", 114524587);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
