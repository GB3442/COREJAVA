package StringPrograms;

public class InsertStrInIdx {

    //Using Normal Approach
    public static String stringAdding(String originalString,String word,int index){
        String newString="";

        for(int i=0;i<originalString.length();i++){
            newString+=originalString.charAt(i);
            if(i==index){
                newString=newString+word;
            }
        }
        return newString;
    }

    // USing subString Method
    public static String stringAddingUsingSubstr(String originalString,String word,int index){
        String newString="";
        newString+=originalString.substring(0,index+1);
        newString+=word;
        newString+=originalString.substring(index+1);
        return newString;
    }

    // USing subString Method
    public static String strAddingStrBfr(String originalString,String word,int index){
        StringBuffer newString=new StringBuffer(originalString);
        newString.insert(index+1,word);
        return  newString.toString();
    }

    public static void main(String[] args) {
       String res=stringAdding("GeeksGeeks","For",4);
        System.out.println(res);

        System.out.println(stringAddingUsingSubstr("GeeksGeeks","For",4));

        System.out.println(strAddingStrBfr("GeeksGeeks","For",4));
    }

    // Using StringBuffer Insert method

}
