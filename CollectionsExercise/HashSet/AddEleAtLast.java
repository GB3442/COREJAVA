package CollectionsExercise.HashSet;

import java.util.*;

public class AddEleAtLast {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(10);
        numbers.add(45);
        numbers.add(5);
        numbers.add(12);
        numbers.add(96);

        System.out.println(numbers);
        numbers.add(1000);
        System.out.println(numbers);

    }
}
