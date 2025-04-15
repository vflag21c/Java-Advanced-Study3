package lambda.ex2;

public class BuildGreeterEx1 {
    public static void main(String[] args) {
        StringFunction helloGreeter = builderGreeter("Hello");
        StringFunction hiGreeter = builderGreeter("Hi");

        System.out.println(helloGreeter.apply("JAVA"));
        System.out.println(hiGreeter.apply("Hi"));
    }

    public static StringFunction builderGreeter(String greeting) {
        return str -> greeting + ", " + str;
    }
}
