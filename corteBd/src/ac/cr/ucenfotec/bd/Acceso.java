package ac.cr.ucenfotec.bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Acceso {

    private Connection connection;
    private Statement statement;

    Acceso(String driver, String conexion) throws Exception {
        connection = null;
        Class.forName(driver);
        connection = DriverManager.getConnection(conexion);
        statement = connection.createStatement();
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public void ejecutarSQL(String sentencia) throws Exception {
        statement.execute(sentencia);
    }

    public ResultSet ejecutarSQL(String sentencia, boolean retorno) throws Exception {
        ResultSet resultSet;
        resultSet = statement.executeQuery(sentencia);
        return resultSet;
    }

    public void iniciarTransaccion() throws java.sql.SQLException {
        connection.setAutoCommit(false);
    }

    public void terminarTransaccion() throws java.sql.SQLException {
        connection.setAutoCommit(true);
    }

    public void aceptarTransaccion() throws java.sql.SQLException {
        connection.commit();
    }

    public void deshacerTransaccion() throws java.sql.SQLException {
        connection.rollback();
    }

    protected void finalize() {
        try {
            connection.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }

    private ResultSet getResultSet(String ptable) {
        String connectionUrl;
        Connection connection;
        Statement statement;
        ResultSet resultSet;
        connection = null;
        statement = null;
        resultSet = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connectionUrl = "jdbc:mysql://localhost:3306/bd_proyecto";
            connection = DriverManager.getConnection(connectionUrl);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM " + ptable);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return resultSet;
    }

}
