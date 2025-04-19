package lambda.lambda4;

import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        Predicate<Integer> predicate1 = i -> i % 2 == 0;
        System.out.println(predicate1.test(3));
    }
}
