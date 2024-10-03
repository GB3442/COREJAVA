package Polymorphism.casting;

class Student{
    public int Id;
    private double balance;
    static String UniversityName;


    Student(){
        System.out.println("Student class constructor is executed....");
    }
    public void display(){
        System.out.println("Dispplay method from parent class..");
    }
    public void display1(){
        System.out.println("Dispplay 1 method from parent class..");
    }
}
public class upcasting extends Student {
    public String name;
    private String Pwd;

    public void demo(){
        System.out.println("Demo method of child class..");
    }
    upcasting(){
        System.out.println("upcasting constructor executed...");
    }

    @Override
    public void display(){
        System.out.println("Dispplay method from Child class..");
        //super.display();
    }


    public static void main(String[] args) {

      Student s=new upcasting();
      //s.display();


      //upcasting ucc=(upcasting) new Student();      // here RE Occoured...

       /* if(s instanceof upcasting && s instanceof upcasting){
           // System.out.println(" In IF block");
            upcasting uc=(upcasting) s;
            uc.name="GK";
            uc.Pwd="hjfhsfs";
            uc.display();
            //uc.demo();
        }   */


        Student sss=new upcasting();
        upcasting c=(upcasting) sss;
        c.demo();


    }
}
