package FEO;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

    private static Connection CONNECTION = null;

    public static Connection getConnection(String databas) throws SQLException, ClassNotFoundException, IOException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            CONNECTION = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + databas, "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return CONNECTION;
    }

    public static void closeConnection() throws SQLException {
        try {
            if (CONNECTION != null) {
                CONNECTION.close();
                CONNECTION = null;
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw e;
        }

    }

}
