package CollectionsExercise.HashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class FindNumLess7 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(45);
        numbers.add(5);
        numbers.add(12);
        numbers.add(96);

        for (Integer i : numbers) {
            if (i < 7) {
                System.out.println(i);
            }
        }
    }
}
