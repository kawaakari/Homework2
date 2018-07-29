package lesson9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TaskDemo2 {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Sam", "Jordan", 15, 84),
                new Student("Sam", "Johnson", 16, 75),
                new Student("Samuel", "Jackson", 16, 61),
                new Student("Melissa", "Black", 15, 87),
                new Student("Amanda", "Black", 15, 85),
                new Student("Mike", "Middleton", 16, 91)
        );

        findHighestGrade(students);

        //       sortByGradeNameAge(students);

        students.sort(new StudentComplexComparator());

        System.out.println(students.toString());

    }

    private static void sortByGradeNameAge(List<Student> students) {
        students.sort(
                Comparator.comparing(Student::getGrade).reversed()
                        .thenComparing(Student::getFamilyName)
                        .thenComparing(Student::getFirstName)
                        .thenComparing(Comparator.comparing(Student::getAge).reversed())
        );
    }

    private static void findHighestGrade(List<Student> list) {
        int max = list.get(0).getGrade();
        int a = 0;
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i).getGrade()) {
                max = list.get(i).getGrade();
                a = i;
            }
        }
        System.out.println(list.get(a).toString());
    }

}
