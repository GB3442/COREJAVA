package Abstraction;

/*
  Rule 5 : - Rule no 5 says that if one abstract class extends another abstract class then there is no need to give
             implementation for parent class abstract methods.
 */

abstract class Parent1{
    abstract void show();
}

public abstract class Rule5 extends Parent1{

    // Here no need to give implementation or body to parent class abstract methods.
    // here child class and parent class both are abstract class then no CE .
}
