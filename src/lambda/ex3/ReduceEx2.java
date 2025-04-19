package lambda.ex3;

import lambda.ex2.MyReducer;

import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceEx2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);

        System.out.println(reduce(list, 0, (a, b) -> a + b));
        System.out.println(reduce(list, 1, (a, b) -> a * b));
    }

    static int reduce(List<Integer> list, int initial, BinaryOperator<Integer> myReducer) {
        for (Integer i : list) {
            initial = myReducer.apply(initial, i);
        }
        return initial;
    }

}
