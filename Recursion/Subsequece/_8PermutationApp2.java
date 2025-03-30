//46. Permutation -> Approach 2
// Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
// nums=[1,2,3]
// Output -> [[1,2,3], [1,3,2], [2,3,1],  [2,1,3], [3,1,2], [3,2,1]]

import java.util.*;

public class _8PermutationApp2 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3 };
        List<List<Integer>> res = new ArrayList<>();

        createPermu(0, res, arr);
        System.out.println(res);
    }

    public static void createPermu(int idx, List<List<Integer>> res, int[] arr) {

        // // Base Case
        if (idx == arr.length) {
            List<Integer> ds = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                ds.add(arr[j]);
            }
            res.add(ds);

            return;
        }

        for (int i = idx; i < arr.length; i++) {
            // swap
            swap(arr, idx, i);
            createPermu(idx + 1, res, arr);
            swap(arr, idx, i);
        }
    }

    public static void swap(int arr[], int idx, int i) {
        int temp = arr[idx];
        arr[idx] = arr[i];
        arr[i] = temp;
    }
}
