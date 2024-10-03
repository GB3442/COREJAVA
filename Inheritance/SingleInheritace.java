package Inheritance;

class SIngle{
    public void Display(){
        System.out.println("Hello this is Display method of Parent class");
    }
}
public class SingleInheritace extends SIngle{


    public static void main(String[] args) {
        SingleInheritace obj=new SingleInheritace();
        obj.Display();
    }
}
