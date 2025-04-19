package lambda.lambda3;

public class GenericMain4 {
    public static void main(String[] args) {
        GenericFunction<String, String> strFunction = s -> s.toUpperCase();
        String hello = strFunction.apply("hello");
        System.out.println("hello = " + hello);

        GenericFunction<String, Integer> stringLength = s -> s.length();
        Integer hello1 = stringLength.apply("hello");
        System.out.println("hello1 = " + hello1);
    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }
}
