package lambda.lambda1;

public class SamMain {
    public static void main(String[] args) {
        SamInterface samInterface = () -> {
            System.out.println("Hello World");
        };

        samInterface.run();
    }
}
