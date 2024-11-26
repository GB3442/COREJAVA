package CollectionsExercise.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class EmptyList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Red");

        if (colors.isEmpty()) {
            System.out.println("List is Empty...");
        } else {
            System.out.println("List is not Empty...");
        }
    }
}
