package singleton_pattern;

public class Logger {

    private static Logger logger = new Logger();
    private StringBuilder logs = new StringBuilder();

    private Logger(){ }

    public static Logger getInstance(){
        return logger;
    }

    public void log(String message){
        this.logs.append(message).append("\n");
    }

    public StringBuilder getLogs(){
        return this.logs;
    }

}
