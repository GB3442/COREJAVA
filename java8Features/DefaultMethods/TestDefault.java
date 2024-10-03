package java8Features.DefaultMethods;

interface i1{
    default void test(){
        System.out.println("Test method of java8Features.DefaultMethods.i1 interface");
    }
}

interface i2{
    default void test(){
        System.out.println("Test method of java8Features.DefaultMethods.i2 interface");
    }
}

public class TestDefault implements i1,i2{

    @Override
    public void test() {
        i2.super.test();
    }

    public static void main(String[] args) {
        TestDefault t=new TestDefault();
        t.test();
    }
}

