import java.util.*;
public class adult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age : ");
        int a = sc.nextInt();

        if(a<=18){
            System.out.println("teen");
        }
        else{
            System.out.println("adult");
        }
    }
}
