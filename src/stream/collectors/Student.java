package stream.collectors;

public class Student {
    private String name;
    private int grade;
    private int score;


    public Student(String name, int grade, int score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public String name() {
        return name;
    }

    public int grade() {
        return grade;
    }

    public int score() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
