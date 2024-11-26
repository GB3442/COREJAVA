package CollectionsExercise.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SearchElementFromArray {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Red");

        if (colors.contains("Yellow")) {
            System.out.println("Element present inside list at index : " + colors.indexOf("Yellow"));
        } else {
            System.out.println("Not present inside the list");
        }

    }
}
