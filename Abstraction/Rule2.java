package Abstraction;

 abstract class Ab{
    abstract void print();   //  RULE 2 : If class have abstract method then this class must be a abstract class.
}

 class Rule2 extends  Ab{
    void print(){
            System.out.println("Rule2");
    }

    public static void main(String[] args) {
         new Rule2().print();

    }
}
