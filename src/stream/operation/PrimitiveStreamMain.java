package stream.operation;

import java.util.IntSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamMain {
    public static void main(String[] args) {
    // 기본형 특화 스트림
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        stream.forEach(System.out::println);

        // 범위 생성 메서드
        IntStream intStream1 = IntStream.range(1, 6); // [ 1, 2, 3, 4, 5]
        IntStream intStream2 = IntStream.rangeClosed(1, 5);

        int sum = IntStream.range(1, 6).sum();
        System.out.println(sum);

        double avg = IntStream.range(1, 6)
                .average()
                .getAsDouble();
        System.out.println(avg);

        // 통계
        IntSummaryStatistics stats = IntStream.range(1, 6)
                .summaryStatistics();
        System.out.println(stats.getSum());
        System.out.println(stats.getMin());
        System.out.println(stats.getMax());
        System.out.println(stats.getAverage());
        System.out.println(stats.getCount());

        // 타입 변환 메서드
        LongStream longStream = IntStream.range(1, 6).asLongStream();
        DoubleStream doubleStream = IntStream.range(1, 6).asDoubleStream();

        Stream<Integer> boxed = IntStream.range(1, 6).boxed();

        LongStream mappedLong = IntStream.range(1, 6)
                .mapToLong(i -> i * 10L);

        DoubleStream doubleStream1 = IntStream.range(1, 5)
                .mapToDouble(i -> i * 1.5);

        Stream<String> mappedObj = IntStream.range(1, 5)
                .mapToObj(i -> "number : " + i);

    }
}
