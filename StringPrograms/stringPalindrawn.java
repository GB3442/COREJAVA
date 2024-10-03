package StringPrograms;

public class stringPalindrawn {

    public static boolean isPalindrawn(String str) {
        String temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            temp +=str.charAt(i);
        }
        return str.equals(temp);
    }

    public static boolean isPalStr(String str){
        StringBuilder sb=new StringBuilder(str);
        sb=sb.reverse();
        return sb.toString().equals(str);
    }

    public static void main(String[] args) {
        String str = "akaka";
        System.out.println(isPalindrawn(str));
        System.out.println(isPalStr(str));
    }
}
