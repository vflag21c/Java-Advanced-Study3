package lambda.lambda4;

import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class PrimitiveFunction {
    public static void main(String[] args) {
        IntFunction<String> function = x -> "숫자: " + x;
        System.out.println(function.apply(100));

        ToIntFunction<String> toIntFunction = s -> s.length();
        System.out.println(toIntFunction.applyAsInt("hello"));
    }
}
