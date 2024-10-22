package MultiThreading.ThreadPausingMethods;
class MyThreadTest extends Thread{
    static Thread t;
    public void run(){
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(1000);
                t.join();
                System.out.println("Child Thread");

            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class DeadLockJoinMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThreadTest t=new MyThreadTest();
        t.start();
        MyThreadTest.t=Thread.currentThread();
          t.join();
        for(int i=1;i<=10;i++){
            Thread.sleep(1000);
            System.out.println("Main Thread");
        }
    }
}
