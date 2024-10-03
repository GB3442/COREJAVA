package Inheritance;
class A{
    public void show(){
        System.out.println(""+this.getClass().getName());
    }
}
class B extends  A{
    B(){
        new B().show();
    }
}
class c extends  A{
    c(){
        new c().show();
    }
}

public class Hierachical extends A {
    public static void main(String[] args) {
        //Hierachical b = new Hierachical();
       // b.show();
        //new c();
    }
}
