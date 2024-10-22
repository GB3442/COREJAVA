package MultiThreading.ThreadPausingMethods;
class DemoThread extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            try{
                System.out.println("Custom Thread.");
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class JoinMethodTest {
    public static void main(String[] args) throws InterruptedException {
        DemoThread t1=new DemoThread();
        t1.start();
        t1.join();
       // t1.join(1000);
        //t1.join(1000,100);

        for(int i=0;i<=10;i++){
            System.out.println("Main Thread.");


        }
    }
}
