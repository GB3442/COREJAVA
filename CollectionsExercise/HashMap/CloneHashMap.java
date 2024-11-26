package CollectionsExercise.HashMap;


import java.util.HashMap;

public class CloneHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> stdMap = new HashMap<>();
        stdMap.put(01, "Rajesh");
        stdMap.put(02, "Suresh");
        stdMap.put(03, "Dinesh");
        stdMap.put(04, "Jayesh");

        System.out.println("Orignal map...");
        System.out.println(stdMap);
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) stdMap.clone();
        System.out.println("Cloned Map...");
        System.out.println(clonedMap);

    }
}
