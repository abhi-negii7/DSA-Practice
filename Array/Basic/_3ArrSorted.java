// Check if the array is sorted or not
// arr[]= {1, 2, 2, 3, 3, 4}
// Output -> true

public class _3ArrSorted {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 3, 3, 4 };
        System.out.println(isSorted(arr));
    }

    // Time Complexity -> O(N)
    public static boolean isSorted(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }
}
