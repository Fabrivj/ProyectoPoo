package ac.cr.ucenfotec.uicorte;

import ac.cr.ucenfotec.capalogica.Gestor;
import ac.cr.ucenfotec.capalogica.MultiUsuario;
import java.sql.SQLException;

public class NewMain {

    public static void main(String[] args) throws Exception {
        //MAIN DE PRUEBA NO UTILIZAR
        
        MultiUsuario a = new MultiUsuario();
       
               
        Gestor nuevoGes = new Gestor();
        try {System.out.println( a.validarCredenciales("Fabrivj79", "1234"));
             
           // nuevoGes.registrarQuerellante("San jose", 115250454, "Esteban", "Masis", 84541545);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
