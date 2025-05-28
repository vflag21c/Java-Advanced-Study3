package stream.collectors;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors2Map {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Stream.of("Apple", "Banana", "Tomato")
                .collect(Collectors.toMap(
                        name -> name, // key
                        name -> name.length() // value
                ));
        System.out.println("map1 = " + map1); // key 가 중복이면 Exception 발생


        Map<String, Integer> map2 = Stream.of("Apple", "Apple", "Tomato")
                .collect(Collectors.toMap(
                        name -> name, // key
                        name -> name.length(), // value
                        (oldVal, newVal) -> oldVal + newVal
                ));
        System.out.println("map2 = " + map2);
    }
}
