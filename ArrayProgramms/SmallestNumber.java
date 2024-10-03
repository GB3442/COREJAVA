package ArrayProgramms;

public class SmallestNumber {
    int Number=Integer.MAX_VALUE;
    //creating method for displaying largest number
    public  void FindSmallestNum(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<Number){
                Number=arr[i];
            }
        }
        System.out.println("Smallest Number is : "+Number);
    }

    public static void main(String[] args) {
        //creating array with elements
        int nums[]={25,24,21,22,65,88,24,85,74};
        //call method using object
        new SmallestNumber().FindSmallestNum(nums);
    }

}
