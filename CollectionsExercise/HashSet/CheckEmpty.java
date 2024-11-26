package CollectionsExercise.HashSet;

import java.util.HashSet;

public class CheckEmpty {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(45);
        numbers.add(5);
        numbers.add(12);
        numbers.add(96);

        System.out.println(" is given set empty ? " + numbers.isEmpty());

    }
}
