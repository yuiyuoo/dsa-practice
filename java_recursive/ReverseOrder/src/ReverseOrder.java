import java.util.ArrayList;
import java.util.List;


// reverse an arr by call recursively

public class ReverseOrder {
    public static void main(String[] args) throws Exception {
        ReverseOrder app = new ReverseOrder();
        int[] arr = {7, 2, 5, 4, 6};
        System.out.println(app.reverseOrder(arr));

    }

    public List<Integer> reverseOrder(int[] arr) {
        List<Integer> res = new ArrayList<>();
        return reverseOrder(res,arr,0);
    }


    public List<Integer> reverseOrder(List<Integer> res, int[] arr, int i) {
        if (arr.length == i) return res;
        res.add(arr[arr.length-1-i]);
        return reverseOrder(res, arr, i+1);
    }
}
