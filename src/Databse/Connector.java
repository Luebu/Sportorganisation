package Databse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
private static Connection conn;
    static String pathdb = "src/Database";
    public static void connect() {
        try {
            // db parameters
            String url = "jdbc:sqlite:"+pathdb;
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void sqlCommand(String sql) {
        // SQLite connection string
        String url = "jdbc:sqlite:"+pathdb;

        // SQL statement for creating a new table


        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Connection getConn() {
        return conn;
    }
}
