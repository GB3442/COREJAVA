package CollectionsExercise.ArrayList;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrimCapacity {

    public static void main(String[] args) throws Exception {
        ArrayList<String> colors = new ArrayList<>(20);
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Red");

        colors.trimToSize();
        ;
        System.out.println(colors.size());


    }
}
