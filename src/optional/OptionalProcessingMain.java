package optional;

import java.util.Optional;

public class OptionalProcessingMain {
    public static void main(String[] args) {
        Optional<String> optValue = Optional.of("Hello");
        Optional<Object> optEmpty = Optional.empty();

        // 값이 존재하면 Consumer 실행, 없으면 아무일도 하지 않음
        optValue.ifPresent(System.out::println);
        optEmpty.ifPresent(System.out::println); // 실행 X

        // 값이 있으면 Consumer 실행, 없으면 Runnable 실행
        optValue.ifPresentOrElse(System.out::println, () -> System.out.println("empty"));
        optEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("empty"));

        // 값이 있으면 Function 적용 후 Optional 로 반환, 없으면 Optional.empty()
        Optional<Integer> lengthOpt1 = optValue.map(String::length);
        System.out.println("lengthOpt1 = " + lengthOpt1);

//        Optional<Integer> lengthOpt2 = optEmpty.map(String::length);
//        System.out.println("lengthOpt2 = " + lengthOpt2);

        // map() 과 유사하나, 이미 Optional 을 반환하는 경우 중첩을 제거
        Optional<Optional<String>> nestedOpt = optValue.map(s -> Optional.of(s)); // Optional[Optional[Hello]]
        System.out.println("nestedOpt = " + nestedOpt);
        Optional<String> flattenedOpt = optValue.flatMap(s -> Optional.of(s));
        System.out.println("flattenedOpt = " + flattenedOpt);

        // 값이 있고 조건을 만족하면 그 값을 그대로, 불만족시 Optional.empty()
        Optional<String> filtered1 = optValue.filter(s -> s.startsWith("H"));
        System.out.println("filtered1 = " + filtered1);
        Optional<String> filtered2 = optValue.filter(s -> s.startsWith("W"));
        System.out.println("filtered2 = " + filtered2);

        // 값이 있으면 단일 요소 스트림, 없으면 빈 스트림
        optValue.stream().forEach(System.out::println);
        optEmpty.stream().forEach(System.out::println); // 값이 없으므로 실행 X
    }
}
