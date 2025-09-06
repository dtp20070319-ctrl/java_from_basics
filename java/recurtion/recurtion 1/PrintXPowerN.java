// set hight of stack = n

public class PrintXPowerN {
    public static int powerOf(int x, int n) {
        if (n == 0) {
            return 1; // base case: x^0 = 1
        }
        if (x == 0) {
            return 0; // base case: 0^n = 0 for n > 0
        }

        int xPowerNm1 = powerOf(x, n - 1);
        int xPower = x * xPowerNm1;
        return xPower;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        int ans = powerOf(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + ans);
    }
}
