package CollectionsExercise.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class SetViewOfKey {
    public static void main(String[] args) {
        HashMap<Integer, String> stdMap = new HashMap<>();
        stdMap.put(01, "Rajesh");
        stdMap.put(02, "Suresh");
        stdMap.put(03, "Dinesh");
        stdMap.put(04, "Jayesh");

        Set<Integer> keySet = stdMap.keySet();

    }

}
