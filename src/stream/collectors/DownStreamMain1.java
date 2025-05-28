package stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DownStreamMain1 {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Kim", 1, 85),
                new Student("Lee", 2, 90),
                new Student("Park", 3, 70),
                new Student("Jung", 3, 60),
                new Student("Park", 3, 70)
        );


        // 1단계 학년별로 학생들을 그룹화 해라.
        Map<Integer, List<Student>> collect1_1 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::grade,  // 그룹화 기준 : 학년
                        Collectors.toList() // 다운스트림 : 학생을 리스트로 수집
                ));
        System.out.println("collect1_1 = " + collect1_1);


        //toList 생략 가능
        Map<Integer, List<Student>> collect1_2 = students.stream()
                .collect(Collectors.groupingBy(Student::grade));
        System.out.println("collect1_2 = " + collect1_2);

        // 2단계 : 학년별로 학생들의 이름을 출력해라.
        Map<Integer, List<String>> collect2 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::grade, // 그룹화 기준: 학년
                        Collectors.mapping(Student::name, // 다운스트림 1: 학생 -> 이름 변환
                                Collectors.toList()) // 다운스트림 2: 변환된 값(이름)을 List로 수집
                ));
        System.out.println("collect2 = " + collect2);

        // 3단계 : 학년별로 학생들의 수를 출력해라.
        Map<Integer, Long> collect3 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::grade,
                        Collectors.counting()
                ));
        System.out.println("collect3 = " + collect3);

        // 4단계 : 학년별로 학생들의 평균 성적을 출력해라.
        Map<Integer, Double> collect4 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::grade,
                        Collectors.averagingInt(Student::score)
                ));
        System.out.println("collect4 = " + collect4);
    }
}
