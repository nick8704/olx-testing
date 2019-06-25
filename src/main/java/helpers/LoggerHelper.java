package helpers;

import java.io.IOException;
import java.util.logging.*;

public class LoggerHelper {

    private static Logger logger = Logger.getLogger(LoggerHelper.class.getName());

    public static Logger getLogger() {
        try {
            setUpLogger();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return logger;
    }

    private static void setUpLogger() throws IOException {
        //file is in user home directory
        Handler handler = new FileHandler("%h/olxLog.log");
        handler.setFormatter(new LoggerFormatter());
        logger.setUseParentHandlers(false);
        logger.addHandler(handler);
    }

    static class LoggerFormatter extends Formatter {

        @Override
        public String format(LogRecord record) {
            return record.getSourceClassName()
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