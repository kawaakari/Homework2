package lesson9;

import java.util.Comparator;

public class FamilyNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int compareResult = o1.getFirstName().compareTo(o2.getFirstName());
        compareResult = compareResult == 0 ? o1.getFamilyName().compareTo(o2.getFamilyName()) : compareResult;
        return compareResult;
    }
}
