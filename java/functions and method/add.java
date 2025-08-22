
import java.util.*;
import java.util.Scanner;

public class add {
    public static int addition(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st number: ");
    int a = sc.nextInt();
    System.out.print("Enter 2nd number: ");
    int b = sc.nextInt();

    int sum = addition(a, b);
    System.out.println("sum is "+sum);
    }
}
