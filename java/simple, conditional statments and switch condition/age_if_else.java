import java.util.*;
public class age_if_else {
    public static void main(String[] args){
        System.out.print("enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        if(age >= 18){
            System.out.println("you are adult!");
        }
        else if (age <18 ) {
            System.out.println("you are teen");
        } else {
            System.out.println("invelid");
        }
        sc.close();
    }
}
