package Blocks;

public class nonStaticBlockTest {

    {
        System.out.println("In NSB 1");
    }
    static{
        System.out.println("In SB 1");

    }
    {
        System.out.println("In NSB 2");
        //System.out.println("value of d is : "+d);
    }
    public static void main(String[] args) {
        nonStaticBlockTest test = new nonStaticBlockTest();
        nonStaticBlockTest test1= new nonStaticBlockTest();

    }
    static{
        System.out.println("In SB 2");
    }
    {
        System.out.println("In NSB 3");
    }
}
