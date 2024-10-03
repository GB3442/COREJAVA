package PatternProgramms;

/*
  Pattern
  ===========
  *
  **
  ***
  ****
  *****

 */
public class program1 {
    public static void main(String[] args) {
         int rows=5;
         int cols=5;

         for(int i=0;i<rows;i++){
             for(int j=0;j<=i;j++){
                 System.out.print("* ");
             }
             System.out.println();
         }

         // program 2 for reverseing above pattern
        System.out.println("=================================\n");
        for(int i=0;i<=rows;i++){
            for(int j=cols;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
