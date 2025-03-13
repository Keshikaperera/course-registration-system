
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author keshi
 */
public class databaseConnection {
    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; // Updated driver
    final static String DB_URL = "jdbc:mysql://localhost:3306/student";
    final static String USER = "root";
    final static String PASS = "";

    public static Connection connection() {
        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public static void main(String[] args) {  // Added main method for testing
        Connection testConn = connection();
        if (testConn != null) {
            System.out.println("Database connected successfully!");
        } else {
            System.out.println("Failed to connect to database.");
        }
    }
}
