public class removieDuplicates {
    public static boolean[] map = new boolean[26];

    public static void DelDup(String str, int idx, String newString){
        
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            DelDup(str, idx+1, newString);
        }else{
            newString+= currChar;
            map[currChar - 'a']= true;
            DelDup(str, idx+1, newString);
        }
        
    }
    public static void main(String[] args){
        String str = "aabbcdabc";
        DelDup(str, 0, "");
    }
    
}
