import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st no :");
        int a = sc.nextInt();
        System.out.print("enter 2nd number :");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("the addtion of these number is :"+sum);
        int sub = a-b;
        System.out.println("the subtraction  of these number is :"+sub);
        int multiplication = a*b;
        System.out.println("the multiplication of these number is :"+multiplication);
        int divition = a/b;
        System.out.println("the divition of these number is :"+divition);
        int remainder = a%b;
        System.out.println("the remainder of these number is :"+remainder);
    }
}
