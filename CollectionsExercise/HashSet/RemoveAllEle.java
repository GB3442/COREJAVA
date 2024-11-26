package CollectionsExercise.HashSet;

import java.util.HashSet;
import java.util.Set;

public class RemoveAllEle {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(45);
        numbers.add(5);
        numbers.add(12);
        numbers.add(96);

        numbers.clear();
        System.out.println(numbers);
    }
}
