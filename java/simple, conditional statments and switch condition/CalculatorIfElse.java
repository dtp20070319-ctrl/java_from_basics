import java.util.*;

public class CalculatorIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = sc.nextInt(); 

        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter the operator symbol (+, -, *, /, %): ");
        String operator = sc.nextLine();

        if (operator.equals("+")) {
            int sum = a + b;
            System.out.println("The addition is: " + sum);
        } else if (operator.equals("-")) {
            int sub = a - b;
            System.out.println("The subtraction is: " + sub);
        } else if (operator.equals("*")) {
            int multiplication = a * b;
            System.out.println("The multiplication is: " + multiplication);
        } else if (operator.equals("/")) {
            if (b != 0) {
                int division = a / b;
                System.out.println("The division is: " + division);
            } else {
                System.out.println("Error: Division by zero!");
            }
        } else if (operator.equals("%")) {
            if (b != 0) {
                int modulo = a % b;
                System.out.println("The remainder is: " + modulo);
            } else {
                System.out.println("Error: Modulo by zero!");
            }
        } else {
            System.out.println("Invalid operator.");
        }

        sc.close(); 
    }
}
