package CollectionsExercise.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CloneArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Red");

        System.out.println("Original List....");
        System.out.println(colors);
        ArrayList<String> clonedList = (ArrayList<String>) colors.clone();
        System.out.println("Cloned List.....");
        System.out.println(clonedList);


    }
}
