package lambda.lambda5.filter;

import java.util.List;

public class FilterMainV5 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);

        List<Integer> evenNumber = GenericFilter.filter(numbers, n -> n % 2 == 0);
        System.out.println("evenNumber = " + evenNumber);

        List<String> strings = List.of("A", "BB", "CCC");
        List<String> stringResult = GenericFilter.filter(strings, s -> s.length() >= 2);
        System.out.println("stringResult = " + stringResult);
    }
}
