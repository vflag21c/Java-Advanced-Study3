package stream.collectors;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DownStreamMain2 {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Kim", 1, 85),
                new Student("Lee", 2, 90),
                new Student("Park", 3, 70),
                new Student("Jung", 3, 60),
                new Student("Park", 3, 70)
        );

        // 2단계 학년별로 가장 점수가 높은 학생을 구해라. reducing 사용
        Map<Integer, Optional<Student>> collect2 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::grade,
                        Collectors.reducing((s1, s2) -> s1.score() > s2.score() ? s1 : s2)
                ));
        System.out.println("collect2 = " + collect2);

        // 3단계 학년별로 가장 점수가 높은 학생을 구해라. maxBy 사용
        Map<Integer, Optional<Student>> collect3 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::grade,
                        Collectors.maxBy(Comparator.comparingInt(Student::score))
                ));
        System.out.println("collect3 = " + collect3);

        // 4단계 학년별로 가장 점수가 높은 학생의 이름을 구해라 ( CollectingAndThe + maxBy 사용 )
        // 학년별 그룹 -> 그룹별 가장 점수가 높은 학생 -> 그룹별 최고점 학생 -> 그룹별 최고점 학생의 이름

        Map<Integer, String> collect4 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::grade,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(Student::score)),
                                sOpt -> sOpt.get().name()
                        )
                ));
        System.out.println("collect4 = " + collect4);

    }
}
