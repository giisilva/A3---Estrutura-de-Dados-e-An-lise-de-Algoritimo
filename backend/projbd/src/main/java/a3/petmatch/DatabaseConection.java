package a3.petmatch;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.List;

public class DatabaseConection  { 
    private static String url = "jdbc:mysql://localhost:3306/petmatch";
    private static String user = "admin";
    private static String password = "admin123";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            return null;
        }
    }

}
