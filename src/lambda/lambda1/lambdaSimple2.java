package lambda.lambda1;

import lambda.Procedure;

public class lambdaSimple2 {
    public static void main(String[] args) {
        Procedure procedure = () -> {
            System.out.println("Hello World");
        };
        procedure.run();

        // 단일 표현식은 중괄호 생략 가능
        Procedure procedure2 = () -> System.out.println("Hello World");
        procedure2.run();
    }
}
