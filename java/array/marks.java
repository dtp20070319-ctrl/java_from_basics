public class marks{
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 96;
        marks[2] = 94;

        //using print statement 
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        System.out.println();

        //using for loop
        for(int i = 0 ; i < 3 ; i++){
            System.out.println(marks[i]);
        }
    }
}