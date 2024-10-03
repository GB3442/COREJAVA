package ArrayProgramms;

public class LargestNumber {
    int Number=Integer.MIN_VALUE;
    //creating method for displaying largest number
    public  void FindLargestNum(int[] arr){
         for(int i=0;i<arr.length;i++){
             if(arr[i]>Number){
                 Number=arr[i];
             }
         }
         System.out.println("Largest Number is : "+Number);
    }

    public static void main(String[] args) {
        //creating array with elements
        int nums[]={25,24,21,22,65,88,24,85,74};
        //call method using object
        new LargestNumber().FindLargestNum(nums);
    }


}
