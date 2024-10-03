package ArrayProgramms;

import java.util.Arrays;

public class findPairsEqulsToNum {

    public static void displayPairs(int[] arr,int number) {
        // sort the array
        Arrays.sort(arr);

        int i=0;
        int j=arr.length-1;

        while (i<j){
            if(arr[i]+arr[j]==number){
                System.out.println(arr[i]+" + "+arr[j]+" ="+number);
                i++;
                j--;
            }
            else if(arr[i]+arr[j]<number){
                i++;
            }
             if(arr[i]+arr[j]>number){
                j--;
            }

        }
    }



    public static void main(String[] args) {
       displayPairs(new int[]{7,5,4,6,9,8,7,5,2,4},14);
    }
}
