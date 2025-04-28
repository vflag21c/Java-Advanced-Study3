package lambda.lambda5.map;

import java.util.List;

public class MapMainV5 {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "orange");

        List<String> upperFruits = GenericMapper.map(list, s -> s.toUpperCase());
        System.out.println("upperFruits = " + upperFruits);

        List<Integer> lengthFruits = GenericMapper.map(list, s -> s.length());
        System.out.println("lengthFruits = " + lengthFruits);


        List<String> starList = GenericMapper.map(List.of(1, 2, 3), n -> "*".repeat(n));
        System.out.println("starList = " + starList);
    }
}
