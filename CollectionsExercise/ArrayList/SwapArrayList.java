package CollectionsExercise.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapArrayList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Red");

        System.out.println("Before Swapping...");
        System.out.println(colors);
        Collections.swap(colors, 0, colors.size() - 1);   // swapping first element with last element
        System.out.println("After Swapping...");
        System.out.println(colors);

    }
}
