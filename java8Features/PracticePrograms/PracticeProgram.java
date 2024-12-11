package CollectionsExercise.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeProgram {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Raj", "Seema", "Girish", "Yash", "Tdit", "Aashish", "tilak", "Rajesh", "Virat", "yuvraj", "Ishant", "Apurva", "Anjali", "Aasha", "AA");

        // Using Collection
        ArrayList<String> newLIst = new ArrayList<>();
        for (String str : list) {
            if (str.startsWith("A")) {
                newLIst.add(str);
            }
        }
        Comparator<String> lengthCmp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Collections.sort(newLIst, lengthCmp);
        System.out.println("========== OUTPUT USING COLLECTION ===========");
        newLIst.forEach(System.out::println);

        //using Stream API
        System.out.println("\n========== OUTPUT USING STREAM API ===========");

        list.stream().filter(str->str.startsWith("A"))
                .sorted((str1,str2)->str1.length()-str2.length())
                .forEach(System.out::println);

    }
}
