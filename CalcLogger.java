package OOP7;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CalcLogger {
    private Logger logger;
    private FileHandler fileHandler;
    private SimpleFormatter simpleFormatter;

    public CalcLogger() {
        this.logger = Logger.getLogger(CalcLogger.class.getName());

        try {
            this.fileHandler = new FileHandler("CalcLogs.txt");
            logger.addHandler(fileHandler);
            this.simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Не удалось инициализировать обработчик файла", e);
        }
    }

    public void createLog(String message) {
        logger.info(message);
    }
    public void createLog(double argReal, double argImaginary) {
        String msg = " (" + argReal + " + " + argImaginary + "i) ";
        logger.info(msg);

    }
}
