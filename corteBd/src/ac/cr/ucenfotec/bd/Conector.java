package ac.cr.ucenfotec.bd;

public class Conector {

    private static Acceso conector = null;

    public static Acceso getConector() throws Exception {
        if (conector == null) {
            conector = new Acceso();
        }
        return conector;
    }

}
