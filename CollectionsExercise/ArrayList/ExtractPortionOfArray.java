package CollectionsExercise.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ExtractPortionOfArray {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Red");

        System.out.println("Original List..");
        System.out.println(colors);
        //we are going to extract list from index 2 to 5
        List<String> extractedList = colors.subList(2, 5);// here 5 will be excluded i.e 2 to 4 i.e 3 elments will printed
        System.out.println(extractedList);

    }
}
