package lesson9;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("this");
        list.add("is");
        list.add("lots");
        list.add("of");
        list.add("pain");
        list.add("for");
        list.add("every");
        list.add("Java");
        list.add("beginner");


        System.out.println(list);
        System.out.println();

        markLength4(list);

        System.out.println(list);
    }

    private static void markLength4(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == 4) {
                list.add(i, "****");
                i++;
            }
        }
    }
}

