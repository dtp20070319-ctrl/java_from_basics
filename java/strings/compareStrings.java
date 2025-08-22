//Strings are inmutable in java
public class compareStrings {
    public static void main(String[] args) {
        String name1 = "tina";
        String name2 = "bina";
        System.out.println();// for better look in terminal

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal!!");
        } else {
            System.out.println("Strings are not equal!!");
        }
    }
}
