package Polymorphism;
/*
  Rule 6 : Static method and final methods also not allowed to override. because static methods are belong to class
   not a object and final method are not allowed overriding.

   If we trying to override static method then it will considered as method hiding not overriding.
 */

class parent{

    public static void show(){
        System.out.println("Heloo this is java class...");
    }

    public final void show(String name){
        System.out.println("Heloo "+name+" this is java class...");
    }
}
public class Rule6 extends parent{

    public static void show(){
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        Rule6 r=new Rule6();
        r.show("GOvind");
    }
}
