package greedy;

import java.util.*;

public class minPlatforms {
    public static void main(String[] args) {
        int[] arr = { 900, 940 };
        int[] dep = { 910, 1200 };
        Arrays.sort(arr);
        Arrays.sort(dep);
        int arrival = 0;
        int depature = 0;
        int counter = 0;
        int max = 0;
        while (arrival < arr.length) {
            if (arr[arrival] < dep[depature]) {
                counter++;
                max = Math.max(counter, max);
                arrival++;
            } else {
                counter--;
                depature++;
            }
        }
        System.out.println("maximum platforms required is " + max);
    }
}
