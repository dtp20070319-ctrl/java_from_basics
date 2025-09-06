//the sequence in which the sum of 2 number is the 3rd numbrt
// for examle: 0,1,1,2,3,5,8,13..... asdfgf;lkjhj 
// this means 0,1,0+1,1+1,2+1+3+2,3+5,5+7,......
public class fibonachi {
    public static void fibo(int a, int b, int n) {

    //a 2nd last sum and b is last sum

        if(n == 0){
            return;
        } 
        int c = a + b ;
        System.out.println(c);
        fibo(b, c, n-1);
    }
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);//1st term is printed 
        System.out.println(b);//2nd turm is printed
        int n = 7;
        fibo(a, b, n-2);// sohear n-2 is written
    }
}
//