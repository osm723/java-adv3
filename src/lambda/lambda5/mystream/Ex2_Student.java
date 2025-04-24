package lambda.lambda5.mystream;

import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.GenericMapper;

import java.util.ArrayList;
import java.util.List;


public class Ex2_Student {

    public static void main(String[] args) {
        // 점수가 80점 이상인 학생의 이름을 추출해라.
        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );

        List<String> directResult = direct(students);
        System.out.println("directResult = " + directResult);

        List<String> lambdaResult = lambda(students);
        System.out.println("lambdaResult = " + lambdaResult);
    }

    private static List<String> direct(List<Student> students) {
        List<String> resultStudents = new ArrayList<>();
        for (Student student : students) {
            int score = student.getScore();
            if (score >= 80) {
                resultStudents.add(student.getName());
            }
        }
        return resultStudents;
    }

    private static List<String> lambda(List<Student> students) {
        List<Student> filtered = GenericFilter.filter(students, student -> student.getScore() >= 80);
        return GenericMapper.map(filtered, student -> student.getName());
    }
}
