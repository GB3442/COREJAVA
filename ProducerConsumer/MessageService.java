package MultiThreading.ProducerConsumer;

import java.util.LinkedList;

public class MessageService {

    public static class Whatsapp{
        LinkedList<String> msgList=new LinkedList<>();
        int msgCapacity=3;
        String[] sampleMsgs={"Hi","Good Morning","Good Night","Sorry!!","Excuse me","Can we go for coffi ?","How are you ?"};

        public void send() throws InterruptedException {
            while(true){
                synchronized (this){
                    while(msgList.size()==msgCapacity)
                        wait();
                    int msgIdx=(int)(Math.random()*7);
                    //System.out.println(msgIdx);
                    msgList.add(sampleMsgs[msgIdx]);
                    System.out.println("Message Sent => "+sampleMsgs[msgIdx]);
                    notify();
                    Thread.sleep(2000);
                }
            }
        }


        public void receive() throws InterruptedException {
             while (true){
                 synchronized (this){
                     while (msgList.size()==0)
                         wait();
                     System.out.println("Incoming message is : "+msgList.removeFirst());
                     notify();

                     Thread.sleep(2000);
                 }
             }
        }
    }



    public static void main(String[] args) throws InterruptedException {
            final Whatsapp wp=new Whatsapp();

            Thread t1=new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        wp.send();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wp.receive();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();


    }
}
