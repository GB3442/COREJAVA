package Blocks;

/* What is Static block ?
 ans :- In java a static block ( static initialization block ) is a block of code that is executed
        when a class is loaded into memory, before any instance of the class are created and before the main method is
        executed. If we want to perform some task before main method is executed then this task should be place in static
        block.
        Static block used to initialize static variables. static block  executed only one time, and it is executed
        implicitly by jvm.
        static block doesn't have name and return type. If we have multiple static blocks then it will executed in the
        order in which they are appear in source code.

*/

class ParentCLass1{
    static{
        System.out.println("In SB of ParentClass 1");
    }
}
public class staticBlockTest extends ParentCLass1 {
    // 1st static block
    static{
        System.out.println("In SB 1 of staticBlockTest");
    }
    public static void main(String[] args) {
        System.out.println("In main method of staticBlockTest");
    }
    //2nd static block
    static{
        System.out.println("In SB 2 of staticBlockTest");
    }
}

class subClass1 extends staticBlockTest{
   static{
       System.out.println("In SB 1 of subclass1");
   }

    public static void main(String[] args) {
        System.out.println("In main method of subclass 1");
    }
}