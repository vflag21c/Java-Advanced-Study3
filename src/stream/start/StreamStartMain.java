package stream.start;

import java.util.List;
import java.util.stream.Stream;

public class StreamStartMain {
    public static void main(String[] args) {
        List<String> names = List.of("Apple", "Banana", "Orange");

        Stream<String> stream = names.stream();
        // 일회성
        List<String> result = stream
                .filter(name -> name.startsWith("B"))
                .map(s -> s.toUpperCase())
                .toList();

        System.out.println("result = " + result);


        names.stream()
                .filter(name -> name.startsWith("B"))
                .map(s->s.toUpperCase())
                .forEach(System.out::println);

        // 메서드 참조
        names.stream()
                .filter(name -> name.startsWith("B"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
