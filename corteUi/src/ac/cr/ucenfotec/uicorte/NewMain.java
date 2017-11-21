package ac.cr.ucenfotec.uicorte;

import ac.cr.ucenfotec.capalogica.Gestor;
import ac.cr.ucenfotec.capalogica.MultiUsuario;
import java.sql.SQLException;

public class NewMain {

    public static void main(String[] args) throws Exception {
        //MAIN DE PRUEBA NO UTILIZAR

//       // -----Registrar secretario
//
//        try {
//            ges.registrarSecretario("Cris24", "1234", "Cristian", "Campos Gonzales", 87451144, 'S');
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//
//        //----PRUEBA DEL LOGIN 
       Gestor ges = new Gestor();
//        try {
//            
//            System.out.println(ges.buscarJuez().toString());
//
//        } catch (Exception e) {
//        }
//        
        
        try {
            
            char acceso = ges.login("Fabrivj79", "1234");
            if (acceso == 'J') {
                System.out.println("Adentro como juez");
            } else if (acceso == 'S') {
                System.out.println("Adentro como Secretario");
            } else if (acceso == 'Q') {
                System.out.println("Adentro como querellante");
            } else if (acceso == 'N') {
                System.out.println("Credenciales invalidas");
            }
        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
        }


//          -----MANEJOO DE CASOS
        //Recibido =1 default
        //Aceptado=2------ a 5 
         //Consulta =3 ------- de 2 a 4 
        //rechazado=4
        //redactado=5 ----- a 7
        //revision = 6 ------ a 4
        //resultado=7
        

        
        
    }
}
