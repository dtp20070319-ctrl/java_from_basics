public class bit{
    public static void main(String[] args) {
        int n = 4;
        int position = 2;
        int bitMask = 1<<position;

        int newMask = bitMask | n; //try with |(OR) &
        System.out.println(+ newMask);
        
        if((bitMask & n)==0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }
    }
}