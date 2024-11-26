package CollectionsExercise.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IncreaseListSize {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println(colors.size());   // 5
        int newSize = colors.size() * 2;

        System.out.println(newSize);
    }
}
