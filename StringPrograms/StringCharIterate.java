package StringPrograms;

import java.lang.reflect.Array;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StringCharIterate {
    public static void main(String[] args) {
        String str="TDITJAVA";

        // 1 st approach to print char
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();

        // 2nd apporach
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }

        System.out.println();
        // 3 rd approach
        for(char ch1:ch){
            System.out.print((ch1)+" ");
        }

        System.out.println();
        // 4 th apporach using Charactor Iterator
        String str2="TDITJAVA";
        CharacterIterator itr=new StringCharacterIterator(str2);
        while(itr.current()!=CharacterIterator.DONE){
            System.out.print(itr.current()+" ");
            itr.next();
        }




    }
}
