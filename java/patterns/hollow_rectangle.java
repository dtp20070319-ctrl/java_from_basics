import java.util.*;

class hollow_rectangle {
    public static void main(String[] args) {

        int row, col;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the rows: ");
        row = sc.nextInt();
        
        System.out.print("Enter the columns: ");
        col = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                // Print '*' for borders, ' ' inside
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to next line
        }

        sc.close(); // Good practice to close Scanner
    }
}
