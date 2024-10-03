package ArrayProgramms;

import java.util.Scanner;

public class deleteElementFromArray {
    public static void main(String[] args) {
        //Creating Scanner object
        Scanner sc=new Scanner(System.in);
        int[] arr={10,25,45,86,52,56,89,85};    // 10 25 45 52 56 89 85
        System.out.println("Enter array index that you want to delete ?");
        int idx=sc.nextInt();

        int[] arr2=new int[arr.length-1];

        for(int i=0;i<arr.length-1;i++){
            if(i<idx){
                arr2[i]=arr[i];
            }
            else if(i==idx){

                continue;
            }
            else{
                arr2[i]=arr[i+1];
            }


        }

        // displaying array elements
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:arr2){
            System.out.print(i+" ");
        }

    }
}
