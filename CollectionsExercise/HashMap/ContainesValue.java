package CollectionsExercise.HashMap;

import java.util.HashMap;

public class ContainesValue {
    public static void main(String[] args) {
        HashMap<Integer, String> stdMap = new HashMap<>();
        stdMap.put(01, "Rajesh");
        stdMap.put(02, "Suresh");
        stdMap.put(03, "Dinesh");
        stdMap.put(04, "Jayesh");

        if (stdMap.containsValue("Brijesh")) {
            System.out.println("Value is present..");
        } else {
            System.out.println("Value is not present..");
        }
    }


}