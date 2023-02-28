package jenkov;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

// have one Method
public class Filters {
    Filter filter = new Filter() {
        @Override
        public boolean isLoggable(LogRecord record) {
            if(record.getLevel().intValue()< Level.WARNING.intValue()){
            return false;
        }
            return true;
        }
    };

}
