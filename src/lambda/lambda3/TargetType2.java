package lambda.lambda3;

import java.util.function.Function;

public class TargetType2 {
    public static void main(String[] args) {

        Function<String, String> upperCase = s -> s.toUpperCase();
        System.out.println(upperCase.apply("hello"));

        Function<Integer, Integer> square = i -> i * i;
        System.out.println(square.apply(2));
    }
}
