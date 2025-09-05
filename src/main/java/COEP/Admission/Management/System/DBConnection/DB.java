package COEP.Admission.Management.System.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private static final String URL  = "jdbc:mysql://localhost:3306/coep_admission?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "Test"; 

    public static Connection get() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}