import java.util.ArrayList;

public class LongestIncreasingSub {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 7, 1, 9 };
        int max = helper(arr, 0, new ArrayList<>());
        System.out.print(max);
    }

    public static int helper(int[] arr, int curr, ArrayList<Integer> result) {
        if (curr == arr.length) {
            return result.size();
        }
        if (!result.isEmpty()) {
            if (result.get(result.size() - 1) > arr[curr]) {
                int pick = helper(arr, curr + 1, result.add(arr[curr]));
                int notpick = helper(arr, curr + 1, result);
            }
        }

    }
}
