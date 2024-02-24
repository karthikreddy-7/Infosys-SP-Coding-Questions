package greedy;

import java.util.Arrays;

public class emp {
    public static void main(String[] args) {
        Integer[] arr = { 3, 30, 34, 9, 5 };
        Arrays.sort(arr, (a, b) -> {
            String ab = a.toString() + b.toString();
            String ba = b.toString() + a.toString();
            return ba.compareTo(ab);
        });
        StringBuilder sb = new StringBuilder();
        for (Integer i : arr) {
            sb.append(i);
        }
        System.out.println(sb.toString());
    }
}
