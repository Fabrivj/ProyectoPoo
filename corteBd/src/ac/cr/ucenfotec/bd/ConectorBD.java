package ac.cr.ucenfotec.bd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ConectorBD {

    private static AccesoBD conectorBD = null;

    public static AccesoBD getConector() throws java.sql.SQLException, Exception {
        String[] texto = getCredenciales();
        //conectorBD = new AccesoBD("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/bd_proyecto_poo?useSSL=false", "root", "1596");
        conectorBD = new AccesoBD(texto[0], texto[1], texto[2], texto[3]);

        return conectorBD;
    }

    public static String[] getCredenciales() throws IOException {
        String[] credenciales = new String[4];
        try {
            FileReader reader = new FileReader("lib/conector.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String datos;
            StringBuilder sdatos = new StringBuilder();

            while ((datos = buffer.readLine()) != null) {
                sdatos.append("").append(datos);
                if (!datos.equals("")) {
                    credenciales = sdatos.toString().split(",");
                }
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return credenciales;
    }
}
