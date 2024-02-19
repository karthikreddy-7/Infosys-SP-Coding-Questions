import java.util.Scanner;

public class MinCoinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coins: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the coins: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the target value: ");
        int x = sc.nextInt();
        int min = findmincoins(arr, n, x);
        System.out.println("minimum coins needed is " + min);
        sc.close();
    }

    static int findmincoins(int[] arr, int n, int x) {
        int min = Integer.MAX_VALUE;
        if (x == 0) {
            return 0;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] <= x) {
                int subresult = findmincoins(arr, n, x - arr[i]);
                if (subresult != Integer.MAX_VALUE && subresult + 1 < min) {
                    min = subresult + 1;
                }
            }
        }
        return min;
    }
}