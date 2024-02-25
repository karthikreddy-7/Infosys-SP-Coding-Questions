import java.util.ArrayList;

public class BitwiseSubsequence {
    public static void main(String[] args) {
        int[] arr = { 15, 6, 5, 12, 1 };
        helper(arr, arr.length, 0, new ArrayList<Integer>());
    }

    public static void helper(int[] arr, int n, int curr, ArrayList<Integer> sequence) {
        if (curr == n) {
            System.out.println(sequence);
            return;
        }
        sequence.add(arr[curr]);
        helper(arr, n, curr + 1, sequence);
        sequence.remove(sequence.size() - 1);
        helper(arr, n, curr + 1, sequence);
    }
}
