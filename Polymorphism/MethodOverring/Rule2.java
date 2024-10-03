package Polymorphism.MethodOverring;
/*
            RULE 2 :  Overridden method must have to take same signature of parent class metod.
 */


import java.util.Arrays;

class Parent{

    public void display(String... name){
        System.out.println("Hello "+name);
    }
}

public class Rule2 extends Parent{

    @Override
    public void display(String... name){
        Arrays.stream(name).forEach(a->System.out.println("Hello "+a));
    }

    public static void main(String[] args) {
        Rule2 r=new Rule2();
        r.display("Govind","Satish","Krishna");
    }
}

