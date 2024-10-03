package StringHandeling;

public class program1 {

    public static void main(String[] args) {
        //this is 1st way to creatig string object
        String s="govind";
        //this is 2nd way to creating string object i.e
        String s2=new String("govind");
        System.out.println(s==s2);
        System.out.println(s.equals(s2));
        System.out.println(s.hashCode()+" "+ s2.hashCode());

        String s3=new String();
        String s4=s3.concat("Hello Java");
        System.out.println(s4);

    }
}
