package MultiThreading;

import javax.swing.plaf.TableHeaderUI;

public class CheckingTwoApproaches implements Runnable {

    static {

        System.out.println("In static block");
        System.out.println(Thread.currentThread().getName());
    }
    public void run(){
        System.out.println("In run method");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        CheckingTwoApproaches ch=new CheckingTwoApproaches();

        System.out.println("In main method");
        System.out.println(Thread.currentThread().getName());
        Thread t=new Thread(ch);


         t.start();
        System.out.println(Thread.currentThread().getName());

        //ch.start();

    }

}
