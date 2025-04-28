package lambda.lambda5.filter;

import java.util.List;

public class FilterMainV4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);

        List<Integer> evenNumber = IntegerFilter.filter(numbers, n -> n % 2 == 0);
        System.out.println("evenNumber = " + evenNumber);
    }
}
