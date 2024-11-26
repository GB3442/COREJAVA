package CollectionsExercise.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveThirdElement {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Red");


        System.out.println("List before removing element");
        System.out.println(colors);
        colors.remove(2);
        System.out.println("List after removing element");
        System.out.println(colors);
    }
}
