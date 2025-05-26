package stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperationMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // collect
        List<Integer> evenNumbers1 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers1);

        List<Integer> evenNumbers2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        Integer[] arr = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));

        long count = numbers.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println(count);

        // reduce
        Optional<Integer> sum1 = numbers.stream()
                .reduce((a, b) -> a + b);
        System.out.println(sum1.get()); // 55

        Integer sum2 = numbers.stream()
                .reduce(100, (a, b) -> a + b);// 초기값 100
        System.out.println(sum2); // 155

        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);
        System.out.println(min.get());

        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);
        System.out.println(max.get());

        Integer first = numbers.stream()
                .filter(n -> n > 5)
                .findFirst().get();
        System.out.println(first);

        // 아무 요소나 하나 찾기
        Integer any = numbers.stream()
                .filter(n -> n > 5)
                .findAny()
                .get();
        System.out.println(any);

        // 짝수 있냐
        boolean hasEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println(hasEven);

        // 모두 만족 하냐
        boolean allPositive = numbers.stream()
                .allMatch(n -> n > 0);
        System.out.println(allPositive);

        // 조건을 만족하는 요소가 없는지
        boolean noneNegative = numbers.stream()
                .noneMatch(n -> n < 0);
        System.out.println("음수가 없나? " + noneNegative);
    }
}
