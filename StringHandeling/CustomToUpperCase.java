package StringHandeling;

import java.util.Locale;


public class CustomToUpperCase {
    public static String customUpperCase(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {

            // this is logic to handle empty space
            if(str.charAt(i)>=97 && str.charAt(i)<=122){
                char ch = (char) (str.charAt(i) - 32); // a=97 and A=65 so if we want to convert a to A then we have to subtract
                // 32 from 97 i.e 97-32=65 i.e we will get A as output
                res = res + ch;
            }
           else{
               char c=(char)str.charAt(i);
               c=(char)32;
               res=res+c;
            }

        }
        return res;
    }

    public static String customToLowerCase(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            // this is logic to handle empty space
            if(str.charAt(i)>=65 && str.charAt(i)<=90){
                char ch = (char) (str.charAt(i) + 32); // a=97 and A=65 so if we want to convert a to A then we have to subtract
                // 32 from 97 i.e 97-32=65 i.e we will get A as output
                res = res + ch;
            }
            else{
                char c=(char)str.charAt(i);
                c=(char)32;
                res=res+c;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        String str1="tdit software";
        System.out.println(customUpperCase(str1));

        String str2="TDIT SOFTWARE";
        System.out.println(customToLowerCase(str2));

    }
}
