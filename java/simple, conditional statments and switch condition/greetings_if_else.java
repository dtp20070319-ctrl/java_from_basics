import java.util.*;
public class greetings_if_else {
    public static void main(String[] args){
        System.out.print("enter number from 1,2,3 : ");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        
        if(button == 1){
            System.out.println("hello");
        }
        else if(button == 2){
            System.out.println("namaste");
        }
        else if(button == 3){
            System.out.println("bonjour");
        }
        else{
            System.out.println("invelid");
        }
    }
}












































