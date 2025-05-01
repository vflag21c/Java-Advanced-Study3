package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamV1Main {
    public static void main(String[] args) {
        // 짝수만 남기고, 남은 값의 2배를 반환
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        returnValue(numbers);
        methodChain(numbers);
    }

    private static void methodChain(List<Integer> numbers) {
        MyStreamV1 stream = new MyStreamV1(numbers);
        List<Integer> list = stream.filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .toList();
        System.out.println("list = " + list);
    }

    private static void returnValue(List<Integer> numbers) {
        MyStreamV1 stream = new MyStreamV1(numbers);
        MyStreamV1 filteredStream = stream.filter(n -> n % 2 == 0);
        MyStreamV1 mapStream = filteredStream.map(n -> n * 2);
        List<Integer> result = mapStream.toList();
        System.out.println("result = " + result);
    }
}
