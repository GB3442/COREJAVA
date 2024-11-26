package CollectionsExercise.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingArrayList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Red");

        // iterating element using for loop
        System.out.println("Iterating element of colllection using simple for loop");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        // iterating element using enhance for loop
        System.out.println("Iterating element of colllection using enhance for loop");

        for (String color : colors) {
            System.out.println(color);
        }
        // iterating element using Iterators
        System.out.println("Iterating element of colllection using iterator");
        Iterator<String> colorItr = colors.iterator();
        while (colorItr.hasNext()) {
            System.out.println(colorItr.next());
        }

        //Iterating element of collection using forEach loop
        System.out.println("Iterating element of colllection using forEach loop");
        colors.forEach(color -> System.out.println(color));

        //Iterating element of collection using forEach loop with method reference
        System.out.println("Iterating element of colllection using forEach loop with method ref");
        colors.forEach(System.out::println);

    }
}
