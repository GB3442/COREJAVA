package ArrayProgramms;

import java.util.Scanner;

public class SearchElementInArray {

    //creating method for search functionality
    public String SearchElement(int[] arr,int num){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return "Number found at array index "+i;
            }
        }
        return "Number not exist in array";
    }

    public static void main(String[] args) {
        int[] arr={10,52,45,63,78,58,69,45};

        // create Scanner object
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num=sc.nextInt();

        //create object of class
        SearchElementInArray obj=new SearchElementInArray();

        //calling method and storing the result
        String result=obj.SearchElement(arr,num);
        //display the result
        System.out.println(result);

    }
}
