package Polymorphism.MethodOverring;
/*
 Rule 4 :  We can not restrict the overridden method scope in sub class. i.e if parent class method declared as public
           then we can not change it to private / protected or default in sub class.

           we can increase scope i.e protected to public we can do , but reverse not possible
 */
class parent12{

    public void display(){
        System.out.println("Welcome to java....");
    }
}

public class Rule4 extends parent12 {

    @Override
     /*protected*/ public void display() {
        super.display();                     //  here we can not change public to protected/private / default
    }
}
