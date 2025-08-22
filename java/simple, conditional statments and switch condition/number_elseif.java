import java.util.*;
public class number_elseif {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter A number: ");
        int a = sc.nextInt();
        System.out.print("enter B number: ");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("equal");
        }else if(a>b){
            System.out.println("A is grater!");
        }else{
            System.out.println("B is greater!");
        }
    }    
}
