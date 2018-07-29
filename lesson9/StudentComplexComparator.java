package lesson9;

import java.util.Comparator;

public class StudentComplexComparator implements Comparator<Student> {

    private GradeComparator gradeComparator = new GradeComparator();
    private FamilyNameComparator familyNameComparator = new FamilyNameComparator();
    private AgeComparator ageComparator = new AgeComparator();

    @Override
    public int compare(Student o1, Student o2) {
        int compareResult = familyNameComparator.compare(o1, o2);
        compareResult = compareResult == 0 ? gradeComparator.compare(o1, o2) : compareResult;
        compareResult = compareResult == 0 ? ageComparator.compare(o1, o2) : compareResult;
        compareResult = compareResult == 0 ? o1.compareTo(o2) : compareResult;

        return compareResult;
    }
}
