//Leetcode No. 40
//  Combination Sum 2 ->
// arr[]={2,1,2,1,1} target=4
// Result -> [1,1,2] , [2,2] should be in sorted fashion
// all unique subsequences equal to target sum   

import java.util.*;

public class _4CombinSum2 {
    public static void main(String[] args) {
        // Given
        int target = 4;
        int arr[] = { 1, 2, 1, 1, 2 };

        Arrays.sort(arr); // 1, 1, 1, 2, 2

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        combinationSum(0, arr, res, ds, target);
        System.out.println(res);
    }

    public static void combinationSum(int idx, int arr[], List<List<Integer>> res, List<Integer> ds, int target) {

        // Base Case
        if (target == 0) {
            res.add(new ArrayList<>(ds));
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            // pick the first element and not pick the same element
            if (i > idx && arr[i] == arr[i - 1])
                continue;

            if (arr[i] > target)
                break;

            ds.add(arr[i]);
            combinationSum(i + 1, arr, res, ds, target - arr[i]);
            ds.remove(ds.size() - 1);
        }
    }

}
