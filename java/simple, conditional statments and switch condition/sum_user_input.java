import java.util.Scanner;

public class sum_user_input {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); 
        
        // Prompt user for input
        System.out.print("Enter first number: ");
        int a = myObj.nextInt();
        
        System.out.print("Enter second number: ");
        int b = myObj.nextInt();
        
        int sum = a + b;
        System.out.println("Sum: " + sum);
        
        myObj.close();
    }
}
