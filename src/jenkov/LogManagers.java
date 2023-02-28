package jenkov;

import java.io.IOException;
import java.util.logging.*;

public class LogManagers {
    public static void main(String[] args) throws IOException {
        LogManager logManager = LogManager.getLogManager();
        // налаштування рівня логування.
        Logger logger = Logger.getLogger("src.example");
        logger.setLevel(Level.INFO);
        // налаштування обробки повідомлень
        FileHandler fileHandler = new FileHandler("myapp.log");
        fileHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(fileHandler);

        //використання логера для логування повідомлень
        logger.log(Level.INFO, "Hello, Logger");
    }
}
