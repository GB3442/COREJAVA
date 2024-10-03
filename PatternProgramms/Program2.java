package PatternProgramms;
//program for hallow rectangle

public class Program2 {
    public static void main(String[] args) {
        int rows=5;
        int cols=5;
        for(int i=0;i<=rows;i++){
            for(int j=0;j<=cols;j++){
                if(i==0 || j==0 || i==rows || j==cols){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
