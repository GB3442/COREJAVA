package MultiThreading.Sysnchroniazation;
class wishingMessageService {
    String name;
    wishingMessageService(String n){
        this.name=n;
    }

    synchronized void wish(String name) throws InterruptedException {
        for(int i=0;i<10;i++) {
            Thread.sleep(1000);
            System.out.println("Good Morning : " + name);
        }
    }

}

class MyThread1 extends  Thread{
    wishingMessageService service;
    String name;

    MyThread1(wishingMessageService s,String n){
        this.service=s;
        this.name=n;
    }

    public void run(){
        try {
                Thread.sleep(1000);
                service.wish(name);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}


public class SynchronizationTest2 {
    wishingMessageService service;
    String name;

    SynchronizationTest2(wishingMessageService s,String name){
        this.service=s;
        this.name=name;
    }

    public static void main(String[] args) {
        wishingMessageService s1=new wishingMessageService("Govind");
        wishingMessageService s2=new wishingMessageService("Satish");
        MyThread1 thread1=new MyThread1(s1,s1.name);
        MyThread1 thread2=new MyThread1(s2,s2.name);
        thread1.start();
        thread2.start();


    }
}
