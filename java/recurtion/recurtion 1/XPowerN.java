// set hight of stack = logn
public class XPowerN {
    public static int powerOf(int x, int n) {
        if (n == 0) {
            return 1; // base case: x^0 = 1
        }
        if (x == 0) {
            return 0; // base case: 0^n = 0 for n > 0
        }

       if(n%2 == 0){
        return powerOf(x, n/2) * powerOf(x, n/2);
       }else{
        return powerOf(x, n/2) * powerOf(x, n/2) * x;
       }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        int ans = powerOf(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + ans);
    }
}
