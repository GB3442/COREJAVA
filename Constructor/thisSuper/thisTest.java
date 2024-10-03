package Constructor.thisSuper;
class A{
    A(int a){
        this(10L);
        System.out.println("Parent class int ");
    }

    A(){
        this(10);
        System.out.println("Parent class 0 arg const");
    }

    A(long a){
        System.out.println("parent class long const");
    }
}
public class thisTest extends A {

    thisTest(){
        System.out.println("child class 0 Arg const");
    }
    public static void main(String[] args) {
        thisTest t=new thisTest();
    }
}
