package StringHandeling;

public class StringMethodTest {
    public static void main(String[] args) {
        String s1="Tdit java";

        //1 to check Stirng is empty or not
        System.out.println(s1.isEmpty()); // false

        //2 to check String length
        System.out.println(s1.length());  // 9

        //3 printing string object
        System.out.println(s1);

        //4 compare two strings
        String s2=new String("Tdit java");
        System.out.println(s1==s2);   // false
        System.out.println(s1.equals(s2)); // true

        //5 comparing string with ignoring case
        String s3="Tdit Java";
        System.out.println(s2.equalsIgnoreCase(s3));  // true

        //6 comparing string lexicographically means after comparision method should return diffrence between string content
        String s4="a";  // 97
        String s5="A";   // 65
        System.out.println(s4.compareTo(s5));   // 97 - 65 = 32

        //7 Startwith and endswith
        String s6="Tdit Java";
        System.out.println(s6.startsWith("T"));  // true
        System.out.println(s6.endsWith("a"));  // true

        //8 print charactor of specific index
        System.out.println(s6.charAt(6)); // a

        //9 FInding index of given charactor
        System.out.println(s6.indexOf("a")); // 4

        //10 getting last occourance of string
        System.out.println(s6.lastIndexOf("a"));

        // 11 if given chars is not contain metod return -1
        System.out.println(s6.indexOf("z"));     // -1  becoz given charactor is not present inside string

        // Replacing string  3 Methods replace , replace ,replaceAll
        String ss="Java Programming";
        String sss=ss.replace("J","K");
        System.out.println(sss);     // Kava Programming
        sss=ss.replace("Java","Python");
        System.out.println(sss);    // Python Programming
        sss=ss.replaceAll("a","x");
        System.out.println(sss); // Jxvx Progrxmming

      // Trimming Stirng
        String s8=" Java Programming Language ";
        String res=s8.trim();
        System.out.println(res);     //  it will trim first and last space of string

        // Q.1 .  How to remove space in String ?
        // ANs :  We have to use replace  method and at place of empty space we haev to add no space
        String spaceres=s8.replace(" ","");
        System.out.println(spaceres);   //  JavaProgrammingLanguage

        // split method
        String s9="Java Language is best";
        String[] seq=s9.split("");
        for(String s:seq){
            System.out.print(s+" ");
        }



    }
}
