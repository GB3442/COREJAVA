package CollectionsExercise.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DoEmptyList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Red");

        System.out.println("Orginal List...");
        System.out.println(colors);
        colors.clear();
        System.out.println("after emptying the list...");
        System.out.println(colors);
    }
}
