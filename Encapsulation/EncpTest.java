package Encapsulation;

import java.util.ArrayList;
import java.util.List;

class student{
    private int sid;
    private String sname;
    private double fees;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public student(int sid, String sname, double fees) {
        this.sid = sid;
        this.sname = sname;
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", fees=" + fees +
                '}';
    }
}
public class EncpTest {


    public static void main(String[] args) {
         student s=new student(01,"GB",12500.0);
         List<student> list=new ArrayList<>();
         list.add(s);
         System.out.println(list);


    }

}
