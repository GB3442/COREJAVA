package ArrayProgramms;

import java.util.Scanner;

public class AddingElementInArray {
    public static void main(String[] args) {
        int[] arr={10,20,50,40};

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        int num=sc.nextInt();

        System.out.println("Enter index number on which you want to add number");
        int idx=sc.nextInt();

        System.out.println("Array before adding element");
        for(int i : arr){
            System.out.print(i+" ");
        }
        // adding element manually
        arr[idx]=num;
        System.out.println();
        System.out.println("Array after adding element");
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
