public class factorial {
    public static int printFact(int n) {
        if(n == 1 || n == 0){
            return 1;
        }
        int fact_1 = printFact(n-1);
        int fact_n = n*fact_1;
        return fact_n;
    }

public static void main(String[] args) {
     int n = 5;
     int factorial = printFact(n);
     System.out.println("the factorial of given number is : " +factorial);
}
}
