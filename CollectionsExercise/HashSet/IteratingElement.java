package CollectionsExercise.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class IteratingElement {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(45);
        numbers.add(5);
        numbers.add(12);
        numbers.add(96);

        for (Integer i : numbers) {
            System.out.println(i);
        }
    }

}
