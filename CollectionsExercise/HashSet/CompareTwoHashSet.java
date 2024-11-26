package CollectionsExercise.HashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

public class CompareTwoHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numbers1 = new HashSet<>();
        numbers1.add(10);
        numbers1.add(45);
        numbers1.add(5);
        numbers1.add(12);
        numbers1.add(96);

        HashSet<Integer> numbers2 = new HashSet<>();
        numbers2.add(10);
        numbers2.add(45);
        numbers2.add(5);
        numbers2.add(12);
        numbers2.add(96);
        numbers2.add(100);


        boolean res = Objects.equals(numbers1, numbers2);
        if (res) {
            System.out.println("equals..");
        } else {
            System.out.println("Not Equals...");
        }


    }
}
