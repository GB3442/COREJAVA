package CollectionsExercise.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReplaceEle {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Red");

        System.out.println(colors);
        Collections.swap(colors, 2, colors.size() - 1);
        System.out.println(colors);

    }
}
