package CollectionsExercise.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleElements {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Red");

        // we use COllections clas utility method to shuffle the list elements
        System.out.println("List before shuffle");
        System.out.println(colors);
        System.out.println("List after shuffle");
        Collections.shuffle(colors);
        System.out.println(colors);
    }
}
