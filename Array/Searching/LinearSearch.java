// Searching Using the Linear Search
// Time Complexity - O(N)

public class LinearSearch {
    public static void linearSearch(int arr[], int target) {
        int loc = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                loc = i;
            }
        }
        if (loc != -1) {
            System.out.println("Element is at the index : " + loc);
        } else {
            System.out.println("Element not in array");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 33, 2, 1, 6, 9, 44, 65 };
        linearSearch(arr, 1);
    }
}
