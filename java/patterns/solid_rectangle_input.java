import java.util.*;
class solid_rectangle_input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int a = sc.nextInt();
        System.out.print("Enter collomb : ");
        int b = sc.nextInt();

        for(int i = 1; i<=a;i++){
            for(int j=1;j<=b;j++){
                System.out.print("* * * * ");
            }
            System.out.println();
        }
        sc.close();
    }
}




