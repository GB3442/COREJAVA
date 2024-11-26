package CollectionsExercise.HashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class SetToTreeSet {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(45);
        numbers.add(5);
        numbers.add(12);
        numbers.add(96);

        TreeSet<Integer> treeset = new TreeSet<>(numbers);   // it follow sorting.
        System.out.println(treeset);

    }
}
