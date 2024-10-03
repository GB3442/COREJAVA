package java8Features.streams.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsEx2 {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("Nepal","India","China","USA","Japan");

        //String joinedString=list.stream().collect(Collectors.joining("->","Our "," Beautiful"));
        //System.out.println(joinedString);
        List<String> newList=list.stream().map(city->"Our "+city+" is Beautiful").collect(Collectors.toList());

        for(String city:newList){
            System.out.println(city);
        }
    }
}
