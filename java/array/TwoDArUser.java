import java.util.*;
public class TwoDArUser {
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
        System.out.print("enter the missing number : ");
        int x = sc.nextInt();

        for(int i=0; i<row; i++){
            for(int j=0;j<col;j++){
                if(numbers[i][j] == x){
                    System.out.println("x found at location("+ i +","+ j +")");
                }
            }
        }
        sc.close();
    }
    
}
