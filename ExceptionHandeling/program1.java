package ExceptionHandeling;

public class program1 {

    public void test(){
        System.out.println("hello this is test");
    }

    public static void main(String[] args) {
        program1 p=new program1();

        try{
            p=null;
            p.test();
            System.out.println("this is line after exp");
        }
        catch (Exception e){
           // e.printStackTrace();
            System.out.println("this is line of catch block"+e.getMessage());
        }



    }
}
