package CollectionsExercise.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JoinTwoArray {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Red");

        List<String> players = new ArrayList<>();
        players.add("Rohit");
        players.add("Virat");
        players.add("Rohan");
        players.add("Bhuvi");
        players.add("Umesh");
        players.add("Jayant");

        colors.addAll(players);
        System.out.println(colors);

    }
}
