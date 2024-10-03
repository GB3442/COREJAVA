package Polymorphism.MethodOverring;
/*
Rule 3 : - In case of premetive data type sub class methos must take same return type of parent class method.
         - In case of Objects or reference data type sub class method can take sake return type or its covarient data type
          here covarient means insteaed of passing parent class object we can pass its sub class object/ child class obj
 */


class parent{

    //premetive data type method
    public int add(int a,int b){
        return a+b;
    }

    //Reference data type method
    public parent giveParent(){
        return new parent();
    }
}

public class Rule3 extends parent {

    @Override
    public int add(int a, int b) {             // here we can not change the int to any other data type as return type
        return super.add(a, b);
    }

//    @Override
//    public Rule3 giveParent() {                // here we are passing its covarient data tyoe or its sub class obj
//        return new Rule3();
//    }

    @Override
    public parent giveParent() {                // here we are passes parent class obj, we can pass child also.
        return new parent();
    }
}
