import java.util.Scanner;


public class factorial {
    
    public static void factorial(int a){
        if (a<0){
            System.out.println("invelid num");
            return;
        }
        int fact =1;
       for(int i=a;i>=1; i--){
        fact = fact*i;
       }
       System.out.println(fact);
       return;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st number: ");
    int a = sc.nextInt();
    // System.out.print("Enter 2nd number: ");
    // int b = sc.nextInt();
    factorial(a);
    
    }
}



