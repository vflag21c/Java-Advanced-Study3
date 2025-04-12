package lambda.lambda1;

@FunctionalInterface // 함수형 인터페이스 선언 ( * 필수 추가 권장 )
public interface SamInterface { // 하나의 추상메서드만 사용 가능.
    void run();
//    void go();
}
