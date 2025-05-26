package stream.operation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperationsMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n + " "));
        System.out.println("\n");

        numbers.stream()
                .map(n -> n * n)
                .forEach(n -> System.out.println(n + " "));
        System.out.println("\n");

        numbers.stream()
                .distinct()
                .forEach(n -> System.out.println(n + " "));

        Stream.of(1,2,4,3,7,5,6)
                .sorted()
                .forEach(n -> System.out.println(n + " "));
        System.out.println("\n");

        Stream.of(1,2,4,3,7,5,6)
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.println(n + " "));
        System.out.println("\n");

        numbers.stream()
                .peek(n -> System.out.println("before: " + n + ", "))
                .map(n -> n * n)
                .peek(n -> System.out.println("after: " + n + ", "))
                .limit(5)
                .forEach(n -> System.out.println(n + " "));
        System.out.println("\n");

        numbers.stream()
                .limit(5)
                .forEach(n -> System.out.println(n + " "));
        System.out.println("\n");

        numbers.stream()
                .skip(5)
                .forEach(n -> System.out.println(n + " "));
        System.out.println("\n");

        // JAVA 9+
        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers2.stream()
                .takeWhile(n -> n < 5)
                .forEach(n -> System.out.println(n + " "));
        System.out.println("\n");

        numbers2.stream()
                .dropWhile(n -> n < 5)
                .forEach(n -> System.out.println(n + " "));
        System.out.println("\n");


    }
}
