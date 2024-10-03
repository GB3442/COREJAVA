package Abstraction;

abstract class RBI{
    public abstract void RBIRules();
   // public abstract void LoanProcedure();
}
class HDFC extends RBI{
    public void RBIRules(){
        System.out.println("HDFC Account holder must have only one account.");
    }
}

class SBI extends RBI{
    public void RBIRules(){
        System.out.println("SBI Account holder can have multiple accounts.");
    }
}
public class Bank  {

         public void BankRules(RBI bank){
             bank.RBIRules();
         }

        public static void main(String[] args) {
              Bank b=new Bank();
              //b.BankRules(new SBI());
               b.BankRules(new SBI());
               b.BankRules(new HDFC());
    }

}
