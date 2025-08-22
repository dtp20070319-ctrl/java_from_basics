import java.util.*;
public class findNum {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array you want : ");
        int size = sc.nextInt();
        int number[] = new int[size];

        for(int i =0;i<size;i++){
            System.out.print("enter aa mubeer u want in "+i+" index : ");
            number[i] = sc.nextInt();
        }

        System.out.print("enter a number u want to find : ");
        int x = sc.nextInt();


        for(int i = 0 ; i < number.length ; i++){
            if (number[i]==x){
                System.out.println("fount at index number : "+i);
            }
        }
        sc.close();
    }
}

    

