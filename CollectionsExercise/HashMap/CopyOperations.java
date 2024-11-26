package CollectionsExercise.HashMap;

import java.util.Collections;
import java.util.HashMap;

public class CopyOperations {
    public static void main(String[] args) {
        HashMap<Integer, String> stdMap = new HashMap<>();
        stdMap.put(01, "Rajesh");
        stdMap.put(02, "Suresh");
        stdMap.put(03, "Dinesh");
        stdMap.put(04, "Jayesh");

        HashMap<Integer, String> newHs = new HashMap<>();
        newHs.putAll(stdMap);
        System.out.println(newHs);

    }
}
