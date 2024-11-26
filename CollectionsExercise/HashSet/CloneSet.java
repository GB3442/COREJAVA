package CollectionsExercise.HashSet;

import java.util.HashSet;

public class CloneSet {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(45);
        numbers.add(5);
        numbers.add(12);
        numbers.add(96);

        HashSet<Integer> clonedSet = (HashSet<Integer>) numbers.clone();

        System.out.println("Original set ");
        System.out.println(numbers);
        System.out.println("Cloned set ");
        System.out.println(clonedSet);
    }
}
