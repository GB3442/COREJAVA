package Abstraction;

abstract class Animal{
    public abstract void makeSOund();
}

class Dog extends Animal{
    @Override
    public void makeSOund() {
        System.out.println("Bhaw Bhaw");
    }
}
class Cat extends Animal{
    @Override
    public void makeSOund() {
        System.out.println("Maew Maew");
    }
}

public class TestAbs {
    public void getSound(Animal a){
        a.makeSOund();
    }
    public static void main(String[] args) {
//        Animal a=new Dog();
//        Animal b=new Cat();
        //new TestAbs().getSound(new Dog());
        Animal a=new Cat();
        a.makeSOund();
    }
}
