import java.util.*;
public class greatest_of_3_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number :");
        int a = sc.nextInt();
        System.out.print("entr 2nd number :");
        int b = sc.nextInt();
        System.out.print("entr 3nd number :");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a+" A is Greater");
        }
        else if (b>a && b>c) {
            System.out.println(b+" B is Greater");
        }
        else{
            System.out.println(c+" C is Greater");
        }
    }
}
