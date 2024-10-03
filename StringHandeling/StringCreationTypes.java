package StringHandeling;

public class StringCreationTypes {
    public static void main(String[] args) {
        // 1
        String s1="Abcd";
        System.out.println(s1);  //Abcd

        // 2
        String s2=new String(s1);
        System.out.println(s2);  // here copy operation perform Abcd

        //3
        StringBuffer sb=new StringBuffer("govind");
        String s3=new String(sb);
        System.out.println(s3); // here copy op govind

        //4
        StringBuilder sb1=new StringBuilder("govind");
        String s4=new String(sb1);
        System.out.println(s4);   // here also copy govind

        //5
        char[] ch={'a','b','c','d','e'};
        String s5=new String(ch);
        System.out.println(s5);  // abcde

        //6
        // Here offset and count value must be give withing range of array or string i.e 0 to length-1 otherwise RE: SIOOB
        char[] ch1={'a','b','c','d','e'};
        String s6=new String(ch1,1,3);
        System.out.println(s6);  //bcd            here "offset" is starting index of string and "count" is no of occourances

        //7
        byte[] b={97,98,99};
        String s7=new String(b);
        System.out.println(s7);  // abc  here ASCII value equivalent chars printed

        //8
        byte[] b1={97,98,99};
        String s8=new String(b1,1,1);
        System.out.println(s8);  // b

    }
}
