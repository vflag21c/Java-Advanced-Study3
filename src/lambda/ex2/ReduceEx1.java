package lambda.ex2;

import java.util.List;

public class ReduceEx1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);

        System.out.println(reduce(list, 0, (a, b) -> a + b));
        System.out.println(reduce(list, 1, (a, b) -> a * b));
    }

    static int reduce(List<Integer> list, int initial, MyReducer myReducer) {
        for (Integer i : list) {
            initial = myReducer.reduce(initial, i);
        }
        return initial;
    }

}
