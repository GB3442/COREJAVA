package Abstraction;
abstract class AB{
    int sid;
    String name;
    abstract void m1();

    AB(int id,String name){
        this.sid=id;
        this.name=name;
        System.out.println("Parent class constructor");
    }
}
public  class Rule3 {      // We can not create object of Absract class.
     void display(){
         System.out.println("Hello world");
     }

    public static void main(String[] args) {
       Rule3 r=new Rule3();
       AB a=new AB(01,"GB"){
          void m1(){
              System.out.println("Hello");
              System.out.println(sid);
              System.out.println(name);
           }
       };
       //.m1();
        /* If we try to create object of abstract class we will get ,
                                   "Rule3 is abstract; cannot be instantiated" .  */
    }
}
