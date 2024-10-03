package ExceptionHandeling;

class studentNotFoundException extends Exception {
    public studentNotFoundException(String msg) {
        super(msg);
    }
}

public class CustomException{
    public static void main(String[] args)  {
        try {
            throw new studentNotFoundException("Student is not present ");
        }
        catch(studentNotFoundException st){
            st.printStackTrace();
            System.out.println(st.getMessage());
        }
    }

}

