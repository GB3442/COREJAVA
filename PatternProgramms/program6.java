package PatternProgramms;

public class program6 {
    public static void main(String[] args) {
        int rows=6;
        int count=1;

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
