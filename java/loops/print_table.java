import java.util.*;
class print_table{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to print table :");
        int n = sc.nextInt();

        for(int i=1;i<11;i++){
            System.out.print(i*n);
        }

    }
}
