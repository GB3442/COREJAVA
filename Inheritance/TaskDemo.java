package Inheritance;

public class TaskDemo extends P1{ //implements Person1,Person2 {
    public void eat(){
        System.out.println("Eat method called.!!!"+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        TaskDemo task1=new TaskDemo();
        task1.eat();
    }
}

// Here we can not use multiple inheritance using classes.
// To achieve Multiple inheritance we use Interfaces in java.
// Because interfaces have only abstract methods and for that methods we provide implementation
// in sub classes. THats why there is no chace for getting diamond problem.