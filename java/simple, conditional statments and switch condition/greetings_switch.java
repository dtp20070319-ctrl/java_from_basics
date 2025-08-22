import java.util.*;
public class greetings_switch {
    public static void main(String[] args){
        System.out.print("enter number from 1,2,3 : ");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button){
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("namaste");
            break;
            case 3: System.out.println("bonjour");
            break;
            default : System.out.println("invelid");
        }
    }
}
