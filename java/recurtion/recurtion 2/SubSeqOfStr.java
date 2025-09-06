public class SubSeqOfStr{

    public static void subsequenses(String str , int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        subsequenses(str, idx+1, newString+currChar);
        
        subsequenses(str, idx+1, newString);

    }
    public static void main(String[] args){
         String str = "abd";
         subsequenses(str, 0, "");
    }
}