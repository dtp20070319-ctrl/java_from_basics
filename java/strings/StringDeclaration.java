//Strings are inmutable in java
import java.util.*;
public class StringDeclaration{
    public static void main(String[] args) {
        System.out.print("enter your name : "); 
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        System.out.println("Welcome "+ name + "!!");
        sc.close();
    }
}
