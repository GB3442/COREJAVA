package ArrayProgramms;

public class MissingNumberFromArr {

    public static int sumOfTotalNum(int n){
        int sumOfTotal=0;
        sumOfTotal=(n*(n+1)/2);
        return sumOfTotal;
    }

    public static int sumOfGivenNum(int[] arr){
        int sumOfGivenNum=0;
        for(int i=0;i<arr.length;i++){
            sumOfGivenNum=sumOfGivenNum+arr[i];
        }
        return sumOfGivenNum;
    }

    public static void main(String[] args) {

        int missingNum= sumOfTotalNum(10) - sumOfGivenNum(new int[]{1,2,4,5,6,7,8,9,10});
        System.out.println(missingNum);
    }
}
