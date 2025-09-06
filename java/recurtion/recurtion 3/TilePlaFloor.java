public class TilePlaFloor {

    public static int tile(int n, int m) {
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int verplac =tile(n-m, m);
        int horplac =tile(n-1, m);
        return verplac + horplac;

    }
    public static void main(String[] args) {
        int n =  4 ,m=2;
        System.out.println(tile(n, m));
    }
}
