package jenkov;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Handlers {
    public static void main(String[] args){
        Logger logger = Logger.getLogger("myapp"); // create logger with name
        FileHandler fileHandler; // filehandler
        try{
            fileHandler = new FileHandler("myapp.log"); // write message in file
            SimpleFormatter formatter = new SimpleFormatter(); // formatter
            fileHandler.setFormatter(formatter); // set formatter message
            logger.info("Hello Logger!"); // loger info
        } catch (IOException e){
            logger.warning("Failed to create log file" + e.getMessage()); // logger error логування помилки
        }
    }
}
