package dbcon;

import java.sql.*;

public class DBConnection {
    
    /*
    public static void main(String[] args) {
        initializeDatabase();
    }
    */
    
    public static Connection initializeDatabase() {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc_cinema", "root", "");
            //System.out.println("Connected to the database successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return conn;
    }
}
