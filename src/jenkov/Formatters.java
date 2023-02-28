package jenkov;

import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Formatters extends Formatter {

    @Override
    public  String format(LogRecord record){
        return record.getLevel() + ":" + record.getMessage(); // get name + message
    }

    public static void formate(LogRecord record){
        System.out.println(record.getLevel() + ":" + record.getMessage()); // get name + message
    }

    public static void main(String[] args){
        Logger logger = Logger.getLogger(Formatters.class.getName()); // create Logger and set name
        logger.setLevel(Level.SEVERE); // set level logger
        LogRecord logRecord = new LogRecord(Level.INFO, "NoFound"); // create LogRecord and set name with message
        Formatters.formate(logRecord); // print logRecord
        System.out.println(logger.getLevel()); // print level logger

    }
}
