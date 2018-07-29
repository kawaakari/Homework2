package lesson9;

public class Student implements Comparable<Student> {

    private String firstName;
    private String familyName;
    private int grade;
    private int age;

    public Student(String firstName, String familyName, int age, int grade) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.getGrade(), o.getGrade());
    }

    public String toString() {
        return "Student{" +
                "First Name = " + firstName +
                ", Family Name = " + familyName +
                ", Age = " + age +
                ", grade= " + grade +
                '}';
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

