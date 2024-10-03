package ObjectCloning;
class Address{
    int pincode;
    String landmark;


}
class student {
    int sid;
    String sname;
    Address address;

}

public class CloneTest implements Cloneable{

//    @Override
//    public int hashCode() {
//        return 100;
//    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest obj1=new CloneTest();
        CloneTest obj2=(CloneTest) obj1.clone();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(System.identityHashCode(obj2));
        System.out.println();
    }
}
