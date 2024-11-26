package CollectionsExercise.HashSet;

import java.util.*;
import java.util.stream.Collectors;

public class GettingEleAtIdx {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(45);
        numbers.add(5);
        numbers.add(12);
        numbers.add(96);

        int idx = 2;
        // we have to conver set into list
        ArrayList<Integer> list = new ArrayList<>(numbers);

        for (int i = 0; i < list.size(); i++) {
            if (i == idx) {
                System.out.println(list.get(i));
            }
        }

    }
}
