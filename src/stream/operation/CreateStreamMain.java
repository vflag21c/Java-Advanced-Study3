package stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamMain {
    public static void main(String[] args) {

        // 컬렉션
        List<String> list = List.of("a", "b", "c");
        Stream<String> stream1 = list.stream();
        stream1.forEach(System.out::println);

        // 배열
        String[] arr = {"a", "b", "c"};
        Stream<String> stream2 = Arrays.stream(arr);
        stream2.forEach(System.out::println);

        // Stream.of()
        Stream<String> stream3 = Stream.of("a", "b", "c");
        stream3.forEach(System.out::println);


        // 무한 스트림 - iterate()
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 2);
        infiniteStream.limit(10).forEach(System.out::println);
        infiniteStream.forEach(System.out::println); // 무한 출력

        Stream<Double> randomStream = Stream.generate(Math::random);
        randomStream.limit(10).forEach(System.out::println);

    }
}
