package stream.basic;

import java.util.List;
import java.util.stream.Stream;

public class DuplicationExecutionMain {
    public static void main(String[] args) {
        // 스트림 중복 실행 확인
        Stream<Integer> stream = Stream.of(1, 2, 3);
        stream.forEach(System.out::println);

        // IllegalStateException
        stream.forEach(System.out::println); // stream has already been operated upon or closed

        // 대안
        List<Integer> list = List.of(1, 2, 3);
        Stream.of(list).forEach(System.out::println);
        Stream.of(list).forEach(System.out::println);
    }
}
