class TowerOfHanoi {

    public static void TowerOfhanoi(int n, String src, String helper, String des) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + des);
            return;
        }

        TowerOfhanoi(n - 1, src, des, helper); // Move n-1 from src to helper
        System.out.println("transfer disk " + n + " from " + src + " to " + des);
        TowerOfhanoi(n - 1, helper, src, des); // Move n-1 from helper to dest
    }

    public static void main(String[] args) {
        int n = 3;
        TowerOfhanoi(n, "s", "h", "d");
    }
}
