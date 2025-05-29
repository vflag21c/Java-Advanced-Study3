package optional;

import java.util.Optional;

public class OptionalRetrievalMain {
    public static void main(String[] args) {
        Optional<String> optValue = Optional.of("Hello");
        Optional<String> optEmpty = Optional.empty();

        // isPresent() 값이 있으면 true
        System.out.println("optValue.isPresent() = " + optValue.isPresent());

        // get() 직접 내부 값을 꺼냄, 값이 없으면 예외
        String getValue = optValue.get();
        System.out.println("getValue = " + getValue);

        // 값이 있으면 그 값, 없으면 지정된 기본값 사용
        String value1 = optValue.orElse("기본값");
        System.out.println("value1 = " + value1);
        String value2 = optEmpty.orElse("기본값");
        System.out.println("value2 = " + value2);

        // 값이 없을 때만 람다가 실행되어 기본값 생성
        String value3 = optValue.orElseGet(() -> {
            return "new value";
        });
        System.out.println("value3 = " + value3);

        String value4 = optEmpty.orElseGet(() -> {
            return "new value";
        });
        System.out.println("value4 = " + value4);

        // 값이 있으면 반환, 없으면 예외 발생
        String s = optValue.orElseThrow(() -> new RuntimeException("값이 없습니다."));

        // Optional을 반환
        Optional<String> result1 = optValue.or(() -> Optional.of("new value"));
        System.out.println("result1 = " + result1);
    }
}
