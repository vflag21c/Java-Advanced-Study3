package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;

public class MapMainV1 {
    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        List<Integer> numbers = mapStringToInteger(list);
        System.out.println("numbers = " + numbers);
    }

    private static List<Integer> mapStringToInteger(List<String> list) {
        List<Integer> numbers = new ArrayList<>();
        for (String s : list) {
            Integer value = Integer.valueOf(s);
            numbers.add(value);
        }
        return numbers;
    }
}
