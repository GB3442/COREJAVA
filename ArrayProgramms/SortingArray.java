package ArrayProgramms;

import java.util.Arrays;
import java.util.Collections;


public class SortingArray {
    public static void main(String[] args) {
        int[] arr={21,54,665,32,52,14,58,966,85,22,45};

       //======= using pre-defind method =========
        Arrays.sort(arr);

        //display array elements
        for(int i:arr){
            System.out.println(i);
        }

        //======== Using manual Logic ==========

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    arr[i]=arr[j];
                }
            }
        }
        // display array elements
        for(int i:arr){
            System.out.println(i);
        }

    }
}
