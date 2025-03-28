// Remove duplicate from the sorted Array
// arr[]={ 1, 1, 2, 2, 2, 3, 3} 
// Output -> { 1, 2, 3}

import java.util.HashSet;

public class _4RemoveDupli {
    public static void main(String[] args) {

        int[] arr = { 1, 1, 2, 2, 2, 3, 3 };

        bruteRemoveDupli(arr);
        optimalRemoveDupli(arr);
    }

    // BruteForce -> Using HashSet
    // Time Complexity -> O(Nlog(N)+N)
    // Space Complexity -> O(N)
    public static void bruteRemoveDupli(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println(set);
    }

    // Optimal -> Using Two Pointer
    // Time Complexity -> O(N)
    public static void optimalRemoveDupli(int[] arr) {

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[++i] = arr[j];
            }
        }
        // Print the Array Element
        for (int j = 0; j <= i; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
