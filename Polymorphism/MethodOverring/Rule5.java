package Polymorphism.MethodOverring;
/*
   Rule 5 :  private methods are not overrideen. if parent class method is not inherited in child class then this method
    can not be overridden i.e private methods of parent class.
 */
class parent2{

    private void test(){
        System.out.println("Hello");
    }
}
public class Rule5 extends  parent2 {

    //@Override
    void test(){
        System.out.println("Hello");    //   this is not vallid.. private method scope are withing a class only so it
                                        // will not allowed to override
    }
}
