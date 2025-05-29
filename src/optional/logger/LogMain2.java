package optional.logger;

// 즉시평가와 지연평가
public class LogMain2 {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.setDebug(true);

        logger.debug(value100() + value200());

        logger.setDebug(false);
        logger.debug(value100() + value200());

    }

    static int value100() {
        System.out.println("value100");
        return 100;
    }

    static int value200() {
        System.out.println("value200");
        return 200;
    }
}
