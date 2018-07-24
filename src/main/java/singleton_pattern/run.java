package singleton_pattern;

public class run {

    public static void main(String[] args){

        Logger logger = Logger.getInstance();
        logger.log("first Message");
        logger.log("second Message");
        System.out.println(logger.getLogs().toString());

        Logger logger1 = Logger.getInstance();
        logger1.log("third Message");
        logger1.log("fourth Message");
        System.out.println(logger.getLogs().toString());
    }
}
