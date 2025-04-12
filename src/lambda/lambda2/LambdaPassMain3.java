package lambda.lambda2;

import lambda.MyFunction;

public class LambdaPassMain3 {
    public static void main(String[] args) {
        MyFunction add = getOperation("add");
        System.out.println("add = " + add.apply(1,2));

        MyFunction sub = getOperation("sub");
        System.out.println("sub = " + sub.apply(1,2));

        MyFunction xxx = getOperation("xxx");
        System.out.println("xxx = " + xxx.apply(1,2));
    }

    // 고차 함수
    static MyFunction getOperation(String operator) {
        switch (operator) {
            case "add":
                return (a, b) -> a + b;
            case "subtract":
                return (a, b) -> a - b;
            default:
                return (a, b) -> 0;
        }
    }
}
