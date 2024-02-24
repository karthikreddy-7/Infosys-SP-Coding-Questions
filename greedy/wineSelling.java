package greedy;

public class wineSelling {
    public static void main(String[] args) {
        int[] arr = { 5, -4, 1, -3, 1 };
        int buy = 0;
        int sell = 0;
        int n = arr.length;
        int operations = 0;

        while (buy < n && sell < n) {
            while (buy < n && arr[buy] <= 0) {
                buy++;
            }
            while (sell < n && arr[sell] >= 0) {
                sell++;
            }
            if (buy < n && sell < n) {
                if (Math.abs(arr[buy]) >= Math.abs(arr[sell])) {
                    operations += Math.abs(buy - sell) * Math.abs(arr[sell]);
                    arr[buy] += arr[sell];
                    arr[sell] = 0;
                } else {
                    operations += Math.abs(buy - sell) * Math.abs(arr[buy]);
                    arr[sell] += arr[buy];
                    arr[buy] = 0;
                }
            }
        }
        System.out.println(operations);
    }
}
