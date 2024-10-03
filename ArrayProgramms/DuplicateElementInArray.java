package ArrayProgramms;

import java.util.ArrayList;

public class DuplicateElementInArray {


    //create method for finding duplicate element
    public static int duplicateEle(int[] arr){
        int number=0;

        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    number=arr[i];
                }
            }
        }
       return number;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,80,50,60,70,20};
         if(duplicateEle(arr)==0){
             System.out.println("No duplicate number in array");
         }
         else{
             System.out.println("duplicate element is : "+duplicateEle(arr));
         }
    }
}
