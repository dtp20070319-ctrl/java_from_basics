public class MoveXATEnd {
    public static void allxend(String str , int ind, int count , String newstring){
       if(ind == str.length()){
        for(int i =0;i<count;i++){
            newstring += 'x';
        }
        System.out.println(newstring );
        return;
       }

       char currChar = str.charAt(ind);
       if(currChar == 'x'){
        count++;
        allxend(str, ind+1, count, newstring);
    }else{
        newstring += currChar;
        allxend(str, ind+1, count, newstring);
    }

    }
    public static void main(String[] args) {
        String str = "axxbxcxxd";
        allxend(str, 0, 0, "");
    }
    
}
