package MultiThreading.DeadLock;
class resource{

    void display(){
        System.out.println("Good Morning!!!"+Thread.currentThread().getName());
    }
}
public class deadlockTest {
    public static void main(String[] args) {
        resource r1=new resource();
        resource r2=new resource();
        Thread t1=new Thread(){
            public void run(){

                synchronized (r1){     // r1 is locked by t1
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //System.out.println(Thread.currentThread().getName());
                    r1.display();    // messsage is printing


                    synchronized (r2){
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        r2.display();
                        r2.notify();


                    }

                }

            }
        };
        Thread t2=new Thread(){
            public void run(){

                synchronized (r2){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                   // System.out.println(Thread.currentThread().getName());
                    r2.display();
                    try {
                        r2.wait();    // here i am releasing the lock of resource r2
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    synchronized (r1){
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        r1.display();
                    }
                }

            }
        };

        t1.start();
        t1.setName("Thread-1");
        t2.start();
        t1.setName("Thread-2");
    }
}
