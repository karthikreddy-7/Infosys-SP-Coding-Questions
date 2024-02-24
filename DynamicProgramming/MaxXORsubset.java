package DynamicProgramming;

public class MaxXORsubset {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5 };
        int n = arr.length;
        int i = n / 2;
        int max = helper(arr, n, i);
        System.out.println(max);
    }

    static int helper(int[] arr, int n, int i) {
        if (i == 0) {
            return 0;
        }
        int taken = arr[i] ^ helper(arr, n, i - 1);
        int nottaken = helper(arr, n, i - 1);
        return Math.max(taken, nottaken);
    }

}
