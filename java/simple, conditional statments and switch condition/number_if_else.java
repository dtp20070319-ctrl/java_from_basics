import java.util.*;
public class number_if_else {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st numbers: ");
        int a = sc.nextInt();
        System.out.print("enter 2nd number: ");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("equal");
        }else{ 
            if(a>b){
                System.out.println("A is greater, B is smaller");
            }else{
                System.out.println("B is grater , A is smaller");
            }
        }
    }
}
