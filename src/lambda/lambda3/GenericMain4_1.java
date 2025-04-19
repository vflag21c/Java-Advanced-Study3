package lambda.lambda3;

public class GenericMain4_1 {
    public static void main(String[] args) {
        GenericFunction<String> strFunction = s -> s.toUpperCase();
        String hello = strFunction.apply("hello");
        System.out.println("hello = " + hello);
    }

    @FunctionalInterface
    interface GenericFunction<T> {
        T apply(T s);
    }
}
