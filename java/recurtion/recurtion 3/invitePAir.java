public class invitePAir {

    public static int invite(int n){
        if(n<=1){
            return 1;
        }
        int way1 = invite(n-1);

        int way2 = (n-1) * invite(n-2);

        return way1 + way2;
    }
    public static void main(String[] args) {
        int n = 4 ;
        System.out.println(invite(n));
    }
}
