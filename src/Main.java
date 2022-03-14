
import Databse.Connector;

import org.sqlite.JDBC;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Date;

public class Main {

    public static void main(String[] args)throws InterruptedException{
        try {
            DriverManager.registerDriver(new JDBC());
        }catch(SQLException e){

        }
        Connector.connect();

        Menu menu = new Menu();

        /*
        try {
            PreparedStatement ps = Connector.getConn().prepareStatement("SELECT * FROM halle");
            ResultSet result = ps.executeQuery();
            System.out.println(result.next());
            System.out.println(result.getInt(1));
        }catch(SQLException e){
            e.printStackTrace();
        }
        */


        }

}