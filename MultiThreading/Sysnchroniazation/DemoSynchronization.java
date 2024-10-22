package MultiThreading.Sysnchroniazation;
class Add{
    int num1;
    int num2;

    public synchronized void add(int x,int y){
        this.num1=x;
        this.num2=y;
        try {
            Thread.sleep(1000);

        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        int res=this.num1+this.num2;
        System.out.println("In "+Thread.currentThread().getName()+" Result : "+res);

    }

}

class Thread1 extends  Thread{
         Add a;

         Thread1(Add a){
             this.a=a;
         }
         public void run(){
          a.add(50,62);
         }
}
class Thread2 extends  Thread{
    Add a;

    Thread2(Add a){
        this.a=a;
    }
    public void run(){
        a.add(70,80);
    }
}

public class DemoSynchronization {
    public static void main(String[] args) {
        Add a=new Add();
        new Thread1(a).start();
        new Thread2(a).start();
        new Thread1(a).start();
        new Thread2(a).start();
    }
}
