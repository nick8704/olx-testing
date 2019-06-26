package helpers;

import java.io.IOException;
import java.util.Date;
import java.util.logging.*;

public class LoggerHelper {

    private Logger logger = Logger.getLogger(LoggerHelper.class.getName());

    public Logger getLogger() {
        try {
            setUpLogger();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return logger;
    }

    private void setUpLogger() throws IOException {
        //file will be created automatically in a user home directory
        Handler handler = new FileHandler("%h/olxLog.log", true);
        handler.setFormatter(new LoggerFormatter());
        logger.setUseParentHandlers(false);
        logger.addHandler(handler);
    }

    static class LoggerFormatter extends Formatter {

        @Override
        public String format(LogRecord record) {
            return new Date(record.getMillis())
                    + " "
                    + record.getSourceClassName()
                    + " -> "
                    + record.getSourceMethodName()
                    + "; "
                    + record.getLevel()
                    + ": "
                    + record.getMessage()
                    + System.getProperty("line.separator");
        }
    }

}