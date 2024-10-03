package PatternProgramms;

public class program9 {
    public static void main(String[] args) {
        int count=5;
        for(int i=0;i<=count;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=count;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
