package CollectionsExercise.ArrayList;

import java.sql.ClientInfoStatus;
import java.util.*;

public class CompareTwoLists {
    public static void main(String[] args) {
        List<String> colors1 = new ArrayList<>();
        colors1.add("Pink");
        colors1.add("Orange");
        colors1.add("Purple");
        colors1.add("Blue");
        colors1.add("Yellow");
        colors1.add("Black");
        colors1.add("Red");

        List<String> colors2 = new ArrayList<>();
        colors2.add("Pink");
        colors2.add("Orange");
        colors2.add("Purple");
        colors2.add("Blue");
        colors2.add("Yellow");


        if (Objects.equals(colors1, colors2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals..");
        }

    }
}
