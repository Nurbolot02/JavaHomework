package Lesson2;

import java.io.IOException;
import java.util.logging.*;

public class TestLogger {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(TestLogger.class.getName());
        //ConsoleHandler consoleHandler = new ConsoleHandler();
        //logger.addHandler(consoleHandler);

        try {
            String pathProject = System.getProperty("user.dir");
            //String pathFileLog = pathProject.concat("/src/main/java/Lesson2/log.xml");
            String pathFileLogSimple = pathProject.concat("/src/main/java/Lesson2/log.txt");
            FileHandler fileHandler = new FileHandler(pathFileLogSimple);
            logger.addHandler(fileHandler);
            SimpleFormatter sFormatter = new SimpleFormatter();
            fileHandler.setFormatter(sFormatter);

//            FileHandler fileHandler = new FileHandler(pathFileLog);
//            logger.addHandler(fileHandler);
//            XMLFormatter xmlFormatter = new XMLFormatter();
//            fileHandler.setFormatter(xmlFormatter);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
//
//        consoleHandler.setFormatter(sFormatter);

        logger.log(Level.WARNING, "tEST LOGGING 1");
        logger.info("Test logging 2");

    }
}
