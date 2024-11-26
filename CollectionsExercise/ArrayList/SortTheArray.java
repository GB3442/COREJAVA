package CollectionsExercise.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTheArray {
    static List<String> colors;

    static {
        colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Red");
    }

    public static void main(String[] args) {

        System.out.println("list before sorting...");
        System.out.println(colors);
        System.out.println("list After sorting...");
        Collections.sort(colors);
        System.out.println(colors);


    }
}
