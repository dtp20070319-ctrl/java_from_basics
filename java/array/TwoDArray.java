import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("enter row : ");
        int row = sc.nextInt();
        
        System.out.print("enter col: ");
        int col = sc.nextInt();

        int[][] numbers = new int[row][col];

        for(int i =0; i<row;i++){
            for(int j=0; j<col ; j++){
                
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        for (int i =0; i<row;i++){
            for(int j=0;j<col; j++){
                System.out.print(numbers[i][j] + " ");
            }
        System.out.println();
        }
        sc.close();
    }

}
