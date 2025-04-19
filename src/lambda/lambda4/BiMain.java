package lambda.lambda4;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiMain {
    public static void main(String[] args) {
        BiConsumer<String, Integer> repeat = (c, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(c);
            }
            System.out.println();
        };
        repeat.accept("*", 5);

        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
        System.out.println(isGreater.test(10, 5));
    }
}
