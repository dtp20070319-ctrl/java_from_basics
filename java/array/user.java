import java.util.Scanner;
public class user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array you want : ");
        int size = sc.nextInt();
        int number[] = new int[size];

        for(int i =0;i<size;i++){
            System.out.print("enter aa mubeer u want in "+i+" index : ");
            number[i] = sc.nextInt();
        }
        
        for(int i = 0 ; i < size ; i++){
            System.out.println(number[i]);
        }
        sc.close();
    }
}
