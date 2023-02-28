import jenkov.LoggingExamples;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/*Logger інструмент який дозволяє програмістав реєструати повідомлення про стан
програми під час її виконання. Він дозволяє збирати інформацію про події,
помилки та стан програми в режиму реального часу, що допомагає зрозуміти
поведінку програми, виявити помилки та знайти способи їх виправлення.
* */

public class Main {




    public static void main(String[] args) {
        LoggingExamples logger = new LoggingExamples();
        System.out.println(logger);

        Logger log = Logger.getLogger("myLogg"); // name of logger
        String name = log.getName();
        System.out.println(name); // get name logger

        log.log(Level.SEVERE,"Hello logging"); // set log name and message

        log.log(Level.SEVERE,"Hello logging: {0} ", "P1"); // set log name and parameter

        log.log(Level.SEVERE, "Hello logging: {0}, {1}",// set log name and parameters object.
                new Object[] {"P1", "P2"});

        log.log(Level.SEVERE, "Hello logging: {0}, {1}", // set log name and exception
                new RuntimeException("Error"));

        Logger logger1 = Logger.getLogger("myLogger"); // set name myLogger
        logger1.addHandler(new ConsoleHandler()); // add handler with print in console
        log.logrb(Level.SEVERE, "jenkov.LoggingExamples","main", // set level, sourceClass, sourceMethod
                "resources.myresources","key1"); // name resource and message

        Handler[] handlers = logger1.getHandlers(); // head logger

        Logger logger2 = Logger.getLogger("myLogger");

        Handler handler = new ConsoleHandler(); // create handler

        logger2.addHandler(handler); // add handler

        logger2.removeHandler(handler); // delete handler

        Logger logg = Logger.getLogger("myLogger1");
        logg.setLevel(Level.INFO); // info about level logger
        String namee = String.valueOf(logg);
        System.out.println(namee);
        System.out.println(logg.getLevel()); // level logger
        boolean isInfoLoggable = logg.isLoggable(Level.INFO);
        // Logger parent = Logger.getParent(); // give parent logger

        boolean useParentLogger = logg.getUseParentHandlers(); // parent name

    }
}