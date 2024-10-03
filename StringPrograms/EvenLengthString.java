package StringPrograms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EvenLengthString {
    public static void main(String[] args) {
        String[] student={"ritesh","ganesh","avi","priyanka","jitesh","saurabh"};

        for(int i=0;i<student.length;i++){
            if(student[i].length()%2==1){
                System.out.println(student[i]);
            }
        }
    }
}
