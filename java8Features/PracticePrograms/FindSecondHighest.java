package java8Features.PracticePrograms;

import java.util.Arrays;
import java.util.List;

public class FindSecondHighest {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().distinct().sorted((n1,n2)->n2.compareTo(n1)).skip(1).findFirst().ifPresent(System.out::print);


    }

}
