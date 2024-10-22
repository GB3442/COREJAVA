package MultiThreading.waitAndnotify;

class totalEaring extends Thread{
    int total=0;
    public void run(){

        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total = total + 100;
            }
            this.notify();
        }



        }

}

public class Program1{
    public static void main(String[] args) throws InterruptedException {

        totalEaring t1=new totalEaring();
        t1.start();

        synchronized (t1){
            t1.wait();
        }
        System.out.println("Total earning is : "+t1.total);
    }
}