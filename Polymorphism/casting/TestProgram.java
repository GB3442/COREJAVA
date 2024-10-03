package Polymorphism.casting;
interface RBI{
    static void rulesForCust(){
        System.out.println("Custmoer name must be gretter tghan 5 letter");
    }

    void loan();
}
class SBI implements RBI{


    @Override
    public void loan() {
        System.out.println("SBI give 5% on loan");
    }
    void custRule(){
        RBI.rulesForCust();
    }
}
class HDFC implements RBI{

    @Override
    public void loan() {
        System.out.println("HDFC give 10% on loan");
    }

}

public class TestProgram {

    public static void main(String[] args) {
     RBI obj=new SBI();
     obj.loan();

     SBI s=(SBI)obj;
     s.custRule();



    }
}
