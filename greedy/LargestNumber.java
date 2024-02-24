package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        String[] arr = { "3", "30", "34", "5", "9" };
        Comparator<String> com = new Comparator<String>() {
            public int compare(String a, String b) {
                String ab = a + b;
                String ba = b + a;
                System.out.println(ab);
                System.out.println(ba);
                System.out.println(ab.compareTo(ba));
                return ab.compareTo(ba) > 0 ? -1 : 1;
            }
        };
        Arrays.sort(arr, com);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }

}
