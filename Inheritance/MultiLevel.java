package Inheritance;
class parent1{
    parent1(){
        System.out.println("THis is parent1 class constructor");
    }
    public void display(){
        System.out.println("In Display One ");
    }
}
class parent2 extends  parent1{
    parent2(){
        System.out.println("THis is parent2 class constructor");
    }
    public void display1(){
        System.out.println("In Display two ");
    }
}
public class MultiLevel extends parent2{
    public static void main(String[] args) {
        MultiLevel obj=new MultiLevel();
        obj.display1();
        obj.display();

    }
}
