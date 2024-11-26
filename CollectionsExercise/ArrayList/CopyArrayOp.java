package CollectionsExercise.ArrayList;

import java.util.ArrayList;
import java.util.List;


public class CopyArrayOp {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Red");
        // we can copy array element from existing arrayList we use Constructor of new arraylist and passes
        // the existing arrylist object
        List<String> newList = new ArrayList<>(colors);
        System.out.println(newList);
        
        // using addAll() method
        newList.addAll(colors);
        System.out.println(newList);

    }
}
