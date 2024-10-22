package MultiThreading;

class ThreadDemo implements Runnable{

    @Override
    public void run() {
     // synchronized (ThreadDemo.class){
          for(int i=1;i<=100;i++){
              System.out.println(""+Thread.currentThread().getName());
          }
      //}
    }
}
public class ThreadTesting{
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo obj=new ThreadDemo();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        t1.setPriority(7);   // here i am setting thread 0 as low priority so it will always execute after thread 1
        t2.setPriority(1);
        t1.start();
        t2.start();
           // This is execute always before to thread 0

    }
}
