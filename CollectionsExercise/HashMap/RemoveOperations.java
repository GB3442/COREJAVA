package CollectionsExercise.HashMap;

import java.io.FilterOutputStream;
import java.util.Collections;
import java.util.HashMap;

public class RemoveOperations {
    public static void main(String[] args) {
        HashMap<Integer, String> stdMap = new HashMap<>();
        stdMap.put(01, "Rajesh");
        stdMap.put(02, "Suresh");
        stdMap.put(03, "Dinesh");
        stdMap.put(04, "Jayesh");

        stdMap.clear();
        System.out.println(stdMap);
    }
}
