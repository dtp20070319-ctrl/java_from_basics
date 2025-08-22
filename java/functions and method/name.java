import java.util.*;


public class name{
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    String name = sc.nextLine();

    printMyName("Welcome dear "+name+" !!");
    }
}