public class OddPrinter {
    public static void main(String[] args) throws Exception {
        int[] arr = {7, 2, 5, 4, 6};
        oddPrinter(arr, 0);
    }

    public static void oddPrinter(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] % 2 == 0) {
            System.out.print(arr[i] + " ");
        }
        oddPrinter(arr, i+1);
    }
}
