package stream.collectors;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors1Basic {
    public static void main(String[] args) {
        List<String> list = Stream.of("JAVA", "Spring", "JPA")
                .collect(Collectors.toList());
        System.out.println("list = " + list);

        // 수정 불가능 리스트
        List<String> unmodifiableList = Stream.of("JAVA", "Spring", "JPA").collect(Collectors.toUnmodifiableList());
        System.out.println("unmodifiableList = " + unmodifiableList);

        // 타입 지정
        TreeSet<String> treeSet = Stream.of("JAVA", "Spring", "JPA").collect(Collectors.toCollection(TreeSet::new));
        System.out.println("treeSet = " + treeSet);
    }
}
