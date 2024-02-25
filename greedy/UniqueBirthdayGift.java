package greedy;

import java.util.ArrayList;
import java.util.List;

public class UniqueBirthdayGift {
    public static void main(String[] args) {
        int n = 2;
        int k = 2;
        List<List<Integer>> result = generateArrays(n, k);
        for (List<Integer> l : result) {
            System.out.println(l);
        }
        System.out.println(result.size());
    }

    public static List<List<Integer>> generateArrays(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        helper(n, k, new ArrayList<>(), result, 1);
        return result;
    }

    public static void helper(int n, int k, List<Integer> current, List<List<Integer>> result, int lastElement) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = lastElement; i <= n; i++) {
            if (current.isEmpty() || i % current.get(current.size() - 1) == 0) {
                current.add(i);
                helper(n, k, current, result, i);
                current.remove(current.size() - 1);
            }
        }
    }
}
