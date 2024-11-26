package CollectionsExercise.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class GetEleAtIdx {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Red");


        //printing element at index 2
        System.out.println(colors.get(2));
    }
}
