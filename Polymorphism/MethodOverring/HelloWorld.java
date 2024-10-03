package Polymorphism.MethodOverring;


import javax.swing.text.html.HTMLEditorKit;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class test{
    String Name="GB";

    void test(){
        System.out.println("In Parent class");
    }
}
public class HelloWorld extends test{
    String Name="kk";
    void test(){
        System.out.println("In child class");
    }
    public static void main(String[] args) {
        test t=new HelloWorld();
        HelloWorld h=(HelloWorld)t;
        String var=h.Name;
        t.test();
        System.out.println(var);
    }
}
