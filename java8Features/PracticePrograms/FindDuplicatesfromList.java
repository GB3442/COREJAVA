package java8Features.PracticePrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesfromList {
    public static void main(String[] args) {
       List<Integer> list= Arrays.asList(10,10,10,12,01,012,5,01,0,20,1,01,01,0,21,0,012,12,10);
       HashSet<Integer> hs=new HashSet<>();
       Set<Integer> duplicates=  list.stream().filter(n->!hs.add(n)).collect(Collectors.toSet());

       System.out.println(duplicates);
    }
}
