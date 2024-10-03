package Polymorphism.Overloading;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class student{
    int sid;
    String name;


    @Override
    public String toString() {
        return "student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                '}';
    }

    public student(int sid, String name) {
        this.sid = sid;
        this.name = name;
    }
}
public class test {
    public static void main(String[] args) {

        List<student> list=Arrays.asList(
                new student(01,"satish"),
                new student(04,"krishna"),
                new student(03,"satish"),
                new student(02,"krishna")


        );

        List<student> sortedList=list.stream().sorted((o1, o2) -> o2.sid - o1.sid).collect(Collectors.toList());
        for(student s:sortedList){
            System.out.println(s);
            //System.out.println();
        }

    }

}
