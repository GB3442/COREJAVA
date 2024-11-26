package CollectionsExercise.HashMap;

import java.util.HashMap;

public class CheckEmpty {

    public static void main(String[] args) {
        HashMap<Integer, String> stdMap = new HashMap<>();
        stdMap.put(01, "Rajesh");
        stdMap.put(02, "Suresh");
        stdMap.put(03, "Dinesh");
        stdMap.put(04, "Jayesh");

        if (stdMap.isEmpty()) {
            System.out.println("Map is empty");
        } else {
            System.out.println("Map is not empty");
        }

    }
}
