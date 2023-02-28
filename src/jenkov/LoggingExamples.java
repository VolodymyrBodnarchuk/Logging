package jenkov;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExamples {
    private static final Logger logger =
            Logger.getLogger(LoggingExamples.class.getName()); // name of logger

    public void doIt() {
        logger.entering(getClass().getName(),"doIt");

        try{

        } catch (Exception e){
            logger.log(Level.SEVERE, "Error doing XYZ", e);
        }

        logger.exiting(getClass().getName(), "doIt");
    }
}
