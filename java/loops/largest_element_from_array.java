public class largest_element_from_array {
    public static void main(String[] args) {
        int marks[] = {12, 23, 34, 45, 56, 67, 78,89, 90, 100};
        int a = getLargest(marks);
        System.out.println("Highest is: " + a);
    }

    public static int getLargest(int number[]) {
        int large = number[0];
        for (int num : number) {
            if (num > large) {
                large = num;
            }
        }
        return large;
    }
}

