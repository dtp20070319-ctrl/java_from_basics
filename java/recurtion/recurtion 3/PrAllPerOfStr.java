public class PrAllPerOfStr{

    public static void printper(String str, String per) {
        if(str.length()== 0){
            System.out.println(per);
            return;
        }
        for(int i=0; i<str.length();i++){
            char chrrChar = str.charAt(i);
            String newStr = str.substring(0,i)+ str.substring(i+1);
            printper(newStr, per+chrrChar);
        }
    }
    public static void main(String[] args) {
       String str = "abc";
       printper(str, ""); 

    }
}