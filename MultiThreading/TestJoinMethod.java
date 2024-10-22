package MultiThreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class DemoThreadJoin extends Thread{

    public void run(){

            //Thread.sleep(1000);
        for(int i=1;i<=100;i++) {
            System.out.println("In Run method");
        }

    }
}
public class TestJoinMethod {
    public static void main(String[] args) throws InterruptedException{

        DemoThreadJoin t1=new DemoThreadJoin();
        t1.start();
        t1.join();

        System.out.println("In main thread");




    }
}
