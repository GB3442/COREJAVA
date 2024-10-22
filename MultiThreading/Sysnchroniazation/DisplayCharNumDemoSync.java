package MultiThreading.Sysnchroniazation;

class Display{
    public synchronized void displayChar(){
        for(int i=65;i<=80;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println((char)i);
        }
    }

    public synchronized void displayNums(){

        for(int i=1;i<=15;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}

class Thread11 extends Thread{
    Display d;

    Thread11(Display d){
        this.d=d;
    }

    public void run(){
        d.displayChar();
    }
}


class Thread12 extends Thread{
    Display d;

    Thread12(Display d){
        this.d=d;
    }

    public void run(){
        d.displayNums();
    }
}


public class DisplayCharNumDemoSync {
    public static void main(String[] args) {
        Display d=new Display();
        Thread11 t1=new Thread11(d);
        Thread12 t2=new Thread12(d);
        t1.start();
        t2.start();
    }
}
