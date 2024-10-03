package ArrayProgramms;

import java.util.Arrays;

public class shiftingZerosToRight {
    static void shiftEleToRight(int[] arr){
        int idx=arr.length-1;
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int i=j;i<=idx;i++){
            arr[i]=0;
        }
       // System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] arr={0,0,4,2,1,0,4,5};
        shiftEleToRight(arr);

    }
}

