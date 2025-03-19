// Largest Element in an array

import java.util.Arrays;

public class _1LargestEle {
    public static void main(String[] args) {
        // Given
        int[] arr = { 3, 2, 1, 5, 2 };

        // findLargBrute(arr);
        findLargBrute(arr);
    }

    // BruteForce
    // Complexity -> O(NlogN)
    public static void findLargBrute(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }

    // Optimal Approach
    // Complexity -> O(N)
    public static void findLargOpti(int[] arr) {
        int larg = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (larg < arr[i]) {
                larg = arr[i];
            }
            System.out.println(larg);
        }
    }
}
