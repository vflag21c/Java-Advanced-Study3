package optional;

import java.util.Optional;
import java.util.Random;

public class OrElseGetMain {
    public static void main(String[] args) {
        Optional<Integer> optValue = Optional.of(100);
        Optional<Object> optEmpty = Optional.empty();

        // 단순 계산
        Integer i1 = optValue.orElse(10 + 20); // 계산 후 버림
        Object i2 = optEmpty.orElse(10 + 20);// 10 + 20 계산 후 사용

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        // 값이 있으면 그 값, 없으면 지정된 기본값 사용
        Integer value1 = optValue.orElse(createDate());
        Object value2 = optEmpty.orElse(createDate());

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);

        //값이 있으면 그 값, 없으면 지정된 람다 사용 - 지연평가
        System.out.println("orelseGet 사용");
        Integer i = optValue.orElseGet(() -> createDate());
        Object o = optEmpty.orElseGet(() -> createDate());

        System.out.println("i = " + i);
        System.out.println("o = " + o);
    }

    static int createDate() {

        try {
            System.out.println("데이터를 생성합니다.");
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        int createValue = new Random().nextInt(100);
        System.out.println("데이터 생성 완료 : " + createValue);

        return createValue;
    }
}
