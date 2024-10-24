package MultiThreading.ProducerConsumer;


import java.util.LinkedList;

public class PCTest {

    public static class PC{
        LinkedList<Integer> list=new LinkedList<>();
        int capacity=2;

        public void produce() throws InterruptedException {
            int value=0;
            while(true){
                synchronized (this){
                    while(list.size()==capacity)
                        wait();   // it pauses the execution of current thread and give chace
                    System.out.println("Producer produce item :"+value);
                    list.add(value++);
                    notify();
                    Thread.sleep(1000);

                }
            }
        }

        // consumer
        public void consume() throws InterruptedException {
            while (true){
                synchronized (this){
                    while(list.size()==0)
                        wait();
                    int val = list.removeFirst();
                    System.out.println("Consumer consumed item :" + val);
                    notify();
                    Thread.sleep(1000);

                }
            }
        }

        public static void main(String[] args) throws InterruptedException {

        final PC pc=new PC();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
              try{
                  pc.produce();
              }
              catch(InterruptedException ie){
                  ie.printStackTrace();
              }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    pc.consume();
                }
                catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
//
       t1.join();
       t2.join();
    }
    }
}
