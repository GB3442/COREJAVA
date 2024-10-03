package ExceptionHandeling.tryCatch;

public class catchingErrors {

    int a;
    String str;
    float f;

    // outOfMemoryError Testing
    public static void createObjs() throws OutOfMemoryError{
        try {
            Integer[] i = new Integer[10000 * 1000000];
        }
        catch (OutOfMemoryError e){
            throw new OutOfMemoryError("Memory is filled with objects");
        }


    }

    // StackOverFloatError
    public static void m2(){
        System.out.println("m2 method");
        m1();
    }
    public static void m1(){
        System.out.println("m1 method");
        m2();
    }
    public static void main(String[] args) {
//        try {
//            createObjs();
//        }
//        catch(Error e){
//            System.out.println(e.getMessage());
//        }

        // calling method m1 or m2 so here we get StackOverFLow Error
       // m1();


        catchingErrors obj1=new catchingErrors();
        obj1.a=10;
        obj1.a=25;
        System.out.println(obj1.a);


        catchingErrors obj2=obj1;

        System.out.println(obj2.a);



    }
}
