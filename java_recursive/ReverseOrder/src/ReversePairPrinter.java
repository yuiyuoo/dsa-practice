public class ReversePairPrinter {

    /* Write a recursive function to print an array in the following order. 
        Input:
        5
        1 5 7 8 9
        Output:
        1 9
        5 8
        7 7 */

    
    public static void main(String[] args) throws Exception {
        int[] arr = {7, 2, 5, 4, 6};
        pairPrint(arr, 0);
        System.out.println();

        int[] arr1 = {7, 2, 5, 4};
        pairPrint(arr1, 0);
    }

    // recursive call: stack
    public static void pairPrint(int[] arr, int i) {
        if (i==arr.length/2) {
            if (arr.length%2==1) {
                System.out.println(arr[i] + " " + arr[arr.length - 1 - i]);
            }
            return;
        }
        System.out.println(arr[i] + " " + arr[arr.length - 1 - i]);
        pairPrint(arr, i+1);
    }
}
