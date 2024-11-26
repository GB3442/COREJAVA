package CollectionsExercise.HashMap;

import java.util.Collections;
import java.util.HashMap;

public class ShallowCapy {
    public static void main(String[] args) {
        HashMap<Integer, String> stdMap = new HashMap<>();
        stdMap.put(01, "Rajesh");
        stdMap.put(02, "Suresh");

        // here shallow copy is performs
        HashMap<Integer, String> newmap = new HashMap<>(stdMap);


    }
}
