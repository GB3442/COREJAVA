package StringPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramString {
    public static boolean isAnagram(String str1,String str2){

        // convert into char[]
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

        //sort the array
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        // check length of both array so we can deside both arrays are same size or not.
        if(ch1.length!=ch2.length){
            return false;
        }
        boolean flag=true;
        // perform loop and traverse each element from array
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                flag=false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("test","estt"));
    }
}
