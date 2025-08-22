import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner nam = new Scanner(System.in); 
        System.out.println("Enter your name:");

        String name = nam.nextLine();  // Use nextLine() for full name input
        System.out.println("Hello, " + name + "!");

        nam.close();  // Always good practice to close Scanner
    } 
}
