package Abstraction;

/*
Rule 4 :  Rules no 4 says that if concrete class extends a abstract class then all methods of parent abstract class
must be Override or implement in Sub class which is Concrete class.
 */

abstract class Test1{
    abstract void display();
}
public class Rule4  extends Test1{
      void display(){
          System.out.println("Rule 4");    // < == here in child class we have to give implementation body for abstract method
      }
}


