import Databse.Connector;
import eu.cr4zyfl1x.logger.LogType;
import eu.cr4zyfl1x.logger.Logger;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        System.out.println("HhhhEyy");
        Connector.connect();
        JFrame frame = new Menu();
        frame.setVisible(true);
        initialzeLogger();
        Connector.sqlCommand("CREATE TABLE IF NOT EXISTS halle " +
                "(HalleID int auto_increment primary Key Not null, " +
                "Hallenname String,  " +
                "Ort String, " +
                "Straße String, " +
                "Platz_Insgesamt int, " +
                "Freier_Platz int, " +
                "Vergebener_Platz int)");

    }
    private static void initialzeLogger(){
        Logger logger = new Logger("Sportorga", new Date(),"logs");
        logger.load();
        Logger.log(LogType.SYSTEM,"Initialized");
    }
}