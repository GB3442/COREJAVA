package StringHandeling;

public class CompareToMethodTest {
    public static void main(String[] args) {
        String s = "Roshan";
        String n = "Rohan";
        String r = "roshan";
        String j = "Akash";
        String a = "5261";
        System.out.println(s.compareTo("roshan"));           // -32
        System.out.println(r.compareToIgnoreCase(s));       //0
        System.out.println(r.compareTo(s));                // 32
        System.out.println(s.compareTo("Ro"));             // 4
        System.out.println("R".compareTo(s));              //-5
        System.out.println(n.compareTo(s));                //  h - s= 104 - 115 = -11
        System.out.println(r.compareTo(j));              // r - A = 114 - 65 =  49
        System.out.println(a.compareTo("2"));            // 5 -2 i.e 3
        System.out.println(a.compareTo("52"));            // 2
    }
}
