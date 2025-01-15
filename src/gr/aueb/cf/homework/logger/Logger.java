package gr.aueb.cf.homework.logger;

import java.time.LocalDateTime;

public class Logger {

    private static final Logger INSTANCE = new Logger();

    private Logger(){

    }

    public static Logger getInstance(){
        return INSTANCE;
    }

    public void logMessage(String message){
        System.err.println( LocalDateTime.now() + " : "  + message);




    }
}
