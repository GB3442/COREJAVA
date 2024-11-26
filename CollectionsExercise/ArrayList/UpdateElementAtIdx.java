package CollectionsExercise.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class UpdateElementAtIdx {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Red");

        System.out.println("List before updating...");
        System.out.println(colors);
        System.out.println("List after updating..");
        colors.set(2, "Brown");
        System.out.println(colors);

    }
}
