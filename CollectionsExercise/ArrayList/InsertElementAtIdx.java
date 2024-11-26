package CollectionsExercise.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class InsertElementAtIdx {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Red");


        System.out.println("List before adding element ");
        System.out.println(colors);
        System.out.println("List before adding element ");
        colors.add(0, "White");
        System.out.println(colors);

    }
}
