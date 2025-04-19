package lambda.lambda4;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorMain {
    public static void main(String[] args) {

        // 개발자의 의도와 로직을 더욱 명확
        // UnaryOperator
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(3));

        // BinaryOperator
        BinaryOperator<Integer> addition = (a, b) -> a + b; // BiFunction<Integer, Integer, Integer>
        System.out.println(addition.apply(1, 3));
    }
}
