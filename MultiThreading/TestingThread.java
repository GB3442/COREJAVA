package MultiThreading;

class Sample extends Thread{
    @Override
    public void run(){
        for (int i=1;i<=10;i++){
            System.out.println("CHild THread");
        }
    }
}

public class TestingThread {
    public static void main(String[] args) {
//         Runnable r=new MultiThreading.Sample();
//         Thread t=new Thread(r);
        Sample t=new Sample();
         t.setPriority(10);
         t.start();
         Thread tt=Thread.currentThread();
         tt.setPriority(5);
        for (int i=1;i<=10;i++){
            System.out.println("Main THread");
        }
    }
}
