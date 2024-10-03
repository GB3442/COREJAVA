package Polymorphism.casting;

class parent{
    public void show(){
        System.out.println("Hello this is show method of parent class...");
    }
    public void test(){
        System.out.println("THis is test method of parent class..");
    }

    int id=1200;

    static void m1(){
        System.out.println("THis is static method of parent class.");
    }
}

class child1 extends  parent{
    public void show1(){
        System.out.println("Hello this is show1 method of child class...");
    }
}

class child2 extends parent{
    public void show1(){
        System.out.println("Hello this is show1 method of child class...");
    }
    int g=56454;
}
public class Child extends parent{
    public void test(){
        System.out.println("THis is test method of child class..");
    }
    static void m1(){
        System.out.println("THis is static method of parent class.");
    }
    public static void main(String[] args) {

        //upcasting
        parent p=new Child();    // here type casting is performing automatically thasts why this is callled as implicit
                                 // type casting.
        p.show();
        m1();


       // Child c=new parent();     // here implicit type casting is not performing.
        //Child c=(Child) new parent();    // here casting is required.
        //

        parent p1=new parent();            // We can do
        child1 c=new child1();                // we can do
        child2 cv=new child2();
        parent p2=new child1();           // we can do..... upcastring
        //child1 c1=new parent();        //  we can not do directly ... CE occoures
       // child1 c1=(child1) new parent();  // here  no CE but we will get RE. ClassCastException
        //parent p11=new child2();        // we can not do becoz it does not have parent child relationship
        //child1 ccc=(child1) new child2();    // incompataible type can not cast

        //parent pppp= new child2();     // here child2 class members are not accessible
        //child2 gggg=(child2) new parent();         class cast exception get
        //gggg.show1();

        parent y=new Child();
        y.test();                 // here we can access both parent clas and child class methods.
        y.show();



         Child ccccc=(Child) y;
          ccccc.test();
          ccccc.show();




    }
}
