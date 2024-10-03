package PatternProgramms;
/*
     1
    2 2
   3 3 3
  4 4 4 4
 */

public class program3 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;

        for (int i=1;i<=rows;i++){
            //space printing
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            // number printing
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        for(int i=1;i<=rows;i++){
            // for space
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            // for number print
            for(int j=rows;j>=i;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        }
    }

