package Abstraction;

abstract class A{
    //abstract void show();              RULE 1 :  It is not mandetory have abstract method inside abstract class

    void hello(){
        System.out.println("Hello Java");
    }
}
public class Rule1 extends A {
    // A a=new A();    we can not create object of Abstract class.

}
