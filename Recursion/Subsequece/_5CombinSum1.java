// Combination Sum 1 
// arr[]={2,3,6,7} , target=7
// Output -> {2,2,3} , {7}

import java.util.*;

public class _5CombinSum1 {
    public static void main(String[] args) {

        int arr[] = { 2, 3, 6, 7 };
        int target = 7;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(arr);

        createCombSum(0, target, res, ds, arr);
        System.out.println(res);
    }

    // Time Complexity -> O((2^k)*k)
    // Space Complexity -> O(k*x) where, k is the average length and x combinations
    public static void createCombSum(int idx, int target, List<List<Integer>> res, List<Integer> ds, int arr[]) {

        // Base Condition
        if (idx == arr.length) {
            if (target == 0)
                res.add(new ArrayList<>(ds));
            return;
        }

        // Pick
        ds.add(arr[idx]);
        if (arr[idx] <= target) {
            createCombSum(idx, target - arr[idx], res, ds, arr);
        }

        // Not Pick
        ds.remove(ds.size() - 1);
        createCombSum(idx + 1, target, res, ds, arr);

    }

}
