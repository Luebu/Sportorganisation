
import Databse.Connector;
import eu.cr4zyfl1x.logger.LogType;
import eu.cr4zyfl1x.logger.Logger;
import org.sqlite.JDBC;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Date;

public class Main {

    public static void main(String[] args){
        try {

            DriverManager.registerDriver(new JDBC());
        }catch(SQLException e){

        }
        System.out.println("HhhhEyy");
        Connector.connect();
        initialzeLogger();
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
    private static void initialzeLogger(){
        Logger logger = new Logger("Sportorga", new Date(),"logs");
        logger.load();
        Logger.log(LogType.SYSTEM,"Initialized");
    }
}