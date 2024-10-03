package PatternProgramms;

public  class program8{
    public static void main(String[] args) {
        int count=6;

         // First Part
        for(int i=0;i<count;i++){

            // for space print
            for(int j=0;j<count-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // for Second Part
        for(int i=count;i>=0;i--){

            // for space print
            for(int j=0;j<count-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}