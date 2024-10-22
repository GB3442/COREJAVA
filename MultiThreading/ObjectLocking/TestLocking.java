package MultiThreading.ObjectLocking;
class MyThread extends Thread{
    int a;



    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized(this){
            System.out.println("Thread name : " + Thread.currentThread().getName());
            System.out.println(" a : " + a);
           // notify();
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TestLocking {
    public static void main(String[] args) throws InterruptedException {

        MyThread t1=new MyThread();
        t1.a=20;
        MyThread t2=new MyThread();
        t2.a=50;
        t1.start();

        t2.start();
        //Thread.currentThread().notifyAll();
    }
}
