package Blocks;
class AAA{
    static{
        System.out.println("SB of Parent");
    }
    AAA(){
        System.out.println("0 arg consyructor of parent");
    }
    {
        System.out.println("NSB of parent");
    }

}

public class staticTest extends AAA {

    staticTest(){
        System.out.println("0 arg constructor of child");
    }
    static{
        System.out.println("SB of child");
    }
    {
        System.out.println("NSB of child");
    }

    public static void main(String[] args) {
        System.out.println("Main method");                          // SB parnt , SB CHild , main method , nsb parent ,
                                                                   // 0 arg parent , nsb of child , o arg child
        new staticTest();
    }
}

