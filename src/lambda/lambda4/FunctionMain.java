package lambda.lambda4;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionMain {
    public static void main(String[] args) {
        Consumer<String> strLog = s -> System.out.println("result = " + s);
        strLog.accept("target");

        Supplier<Integer> random = () -> new Random().nextInt();
        System.out.println(random.get());

        Runnable runnable = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        runnable.run();
    }
}
