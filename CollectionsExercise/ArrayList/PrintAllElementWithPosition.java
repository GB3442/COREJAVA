package CollectionsExercise.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class PrintAllElementWithPosition {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Red");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i) + " present at idx : " + i);
        }
    }
}
