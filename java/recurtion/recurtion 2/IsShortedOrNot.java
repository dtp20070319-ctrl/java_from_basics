public class IsShortedOrNot {

    public static boolean isShorted(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] <= arr[idx+1]){
            return isShorted(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 4,6, 8};
        System.out.println(isShorted(arr, 0));
    }
}
