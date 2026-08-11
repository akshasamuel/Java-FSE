public class App {
    public static void main(String[] args){
        System.out.println("Trying to initialize the singleton instance...");
        
        Logger logger = Logger.getInstance();
        System.out.println("Singleton instance initialized: " + logger);

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        if(logger == logger1 && logger == logger2){
            System.out.println("Only one instance of Logger is created.");
        } else{
            System.out.println("Logger instances are different.");
        }

        logger.log("This is a test log message.");
    }
}
