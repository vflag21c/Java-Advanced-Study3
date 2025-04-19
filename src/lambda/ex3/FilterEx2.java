package lambda.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterEx2 {
    public static void main(String[] args) {

        List<Integer> list = List.of(-3, -2, -1, 1, 2, 3, 5);
        List<Integer> negative = filter(list, i -> i < 0);
        System.out.println("negative = " + negative);


        List<Integer> even = filter(list, i -> (i % 2 == 0));
        System.out.println("even = " + even);
    }

    static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if (predicate.test(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
