package Polymorphism;
/*
Q.1) What is Polymorphism ?
ans : When an object perform diffrent beheviour in diffrent situation then that concept is called as polymorphism.

we can achive polymorphisn in two ways
===========================
1 . Method Overloading
2 . Method Overriding

1 Method Overloading ?
ans : - Declaring multiple methods in same classs with the same name but in diffrent paremeter list is callled as method
        overloding.

2 Method Overiding ?
ans : Redefing a method of parent class into child class with the same method signature is called as method overriding.


 */
public class Program1 {

    public void test(int a,int b){
        System.out.println("int , int param method....");
    }

    public void test(int a,int b,int c){
        System.out.println("int , int  , int param method....");
    }


    public static void main(String[] args) {
          Program1 p=new Program1();
          p.test(10,450,45);
    }
}
