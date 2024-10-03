package java8Features.streams.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsEx3 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(10,45,54,48);
      //int sum= list.stream().collect(Collectors.summingInt(Integer::intValue));
        // long sum= list.stream().mapToInt(Integer::intValue).sum();
        int sum=list.stream().collect(Collectors.summingInt(Integer::intValue));

        System.out.println(sum);
    }
}
