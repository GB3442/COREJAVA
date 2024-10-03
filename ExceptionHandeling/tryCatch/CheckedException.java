package ExceptionHandeling.tryCatch;

import java.io.*;

// program for checked Exception
public class CheckedException {
    int a=20;

    // for ClassNotFoundException Testing
    public void classnotfounexp() throws ClassNotFoundException {
       try {
           Class.forName("CheckException");
       }catch(ClassNotFoundException ce){
           throw new ClassNotFoundException("Do not pass unavailable class name");
       }

    }

    // for FileNotFOundException testing

    public void fileNotFound() throws FileNotFoundException {

        File f=new File("Abc.txt");
        InputStreamReader reader=new FileReader(f);

        try {
            System.out.println(reader.read());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //
    public static void main(String[] args) {
//
//        try {
//            new CheckedException().classnotfounexp();
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Exception message : "+e.getMessage());
//        }

        try {
            new CheckedException().fileNotFound();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
