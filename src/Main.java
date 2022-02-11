import Databse.Connector;
import eu.cr4zyfl1x.logger.LogType;
import eu.cr4zyfl1x.logger.Logger;

import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        System.out.println("HhhhEyy");
        Connector.connect();

        new Menu();
        initialzeLogger();

    }
    private static void initialzeLogger(){
        Logger logger = new Logger("Sportorga", new Date(),"logs");
        logger.load();
        Logger.log(LogType.SYSTEM,"Initialized");
    }
}