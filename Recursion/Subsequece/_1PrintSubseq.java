// Print all subsequences -> A contigeous/non- contigeous sequences, which
// allows the order.
// arr[]-{3,1,2}
// output -> {}, {3}, {2}, {1}, {3,1}, {1,2}, {3,2}, {3,1,2}

import java.util.*;

public class _1PrintSubseq {

    public static void main(String[] args) {

        int arr[] = { 3, 1, 2 };
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        createSubset(0, res, subset, arr);
        System.out.println(res);
    }

    // Method to create All the Subset

    public static void createSubset(int idx, List<List<Integer>> res, List<Integer> subset, int[] arr) {

        // Base Case
        if (idx == arr.length) {
            res.add(new ArrayList<>(subset));
            return;
        }

        // Pick element
        subset.add(arr[idx]);
        createSubset(idx + 1, res, subset, arr);

        // Not Pick element
        subset.remove(subset.size() - 1);
        createSubset(idx + 1, res, subset, arr);

    }
}