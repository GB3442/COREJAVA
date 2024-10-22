package MultiThreading.FirstApproach;

class ThreadDemo extends Thread{
    @Override
    public void run(){
        for (int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }

    // here we can override run method but thread class start method not call this method.. It is always call no arg of run
    public void run(int i){

        System.out.println("This is overriding method");
    }
}
public class CreatingThread1 {

    public static void main(String[] args) {
        ThreadDemo obj=new ThreadDemo();
        obj.start();
        for (int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
