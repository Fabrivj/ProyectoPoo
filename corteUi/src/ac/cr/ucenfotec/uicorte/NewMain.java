package ac.cr.ucenfotec.uicorte;

import ac.cr.ucenfotec.capalogica.Gestor;
import ac.cr.ucenfotec.capalogica.MultiUsuario;
import java.sql.SQLException;

public class NewMain {

    public static void main(String[] args) throws Exception {
        //MAIN DE PRUEBA NO UTILIZAR

        Gestor ges = new Gestor();
        
        
//        -----Registrar secretario
//https://www.youtube.com/watch?v=2KtHNZ1IUO4
//        try {
//            ges.registrarSecretario("Cris24", "1234", "Cristian", "Campos Gonzales", 87451144, 'S');
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }

        //----PRUEBA DEL LOGIN 
        try {
            
           
            char acceso=ges.login("115250454", "");
            if ( acceso== 'J') {
                System.out.println("Adentro como juez");
            } else if (acceso == 'S') {
                System.out.println("Adentro como Secretario");
            } else if (acceso == 'Q') {
                System.out.println("Adentro como querellante");
            } else if(acceso=='N'){
                System.out.println("Credenciales invalidas");
            } 
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}
