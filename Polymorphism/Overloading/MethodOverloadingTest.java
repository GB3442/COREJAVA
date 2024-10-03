package Polymorphism.Overloading;

public class MethodOverloadingTest {

    public void test(int a){
        System.out.println(a);
    }
    public void test(float a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        new MethodOverloadingTest().test(15);
        new MethodOverloadingTest().test('b');
        new MethodOverloadingTest().test(10.5f);
        new MethodOverloadingTest().test(10);
    }
}

