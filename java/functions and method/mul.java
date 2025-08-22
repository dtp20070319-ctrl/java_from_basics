import java.util.Scanner;

public class mul {
    
    public static int multiplication(int a, int b){
        int mul = a*b;
        return mul;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st number: ");
    int a = sc.nextInt();
    System.out.print("Enter 2nd number: ");
    int b = sc.nextInt();

    int mul= multiplication(a, b);
    System.out.println("multiplication is "+mul);
    }
}

