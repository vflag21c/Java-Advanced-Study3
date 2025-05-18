package stream.basic;

import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        List<Integer> orginList = List.of(1, 2, 3, 4);

        List<Integer> filteredList = orginList.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(orginList);
        System.out.println(filteredList);
    }
}
