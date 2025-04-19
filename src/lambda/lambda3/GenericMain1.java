package lambda.lambda3;

public class GenericMain1 {
    public static void main(String[] args) {
        StringFunction upperCase = s -> s.toUpperCase();
        String result = upperCase.apply("hello");
        System.out.println("result = " + result);

        NumberFunction square = n -> n * n;
        Integer result2 = square.apply(2);
        System.out.println("result2 = " + result2);
    }


    @FunctionalInterface
    interface StringFunction {
        String apply(String s);
    }

    @FunctionalInterface
    interface NumberFunction {
        Integer apply(Integer s);
    }
}
