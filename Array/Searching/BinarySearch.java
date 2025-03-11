// Search the element using the Binary Search
// Time Complexity - O(log N)

public class BinarySearch {
    public static int binarySearch(int arr[], int target) {
        int lb = 0;
        int ub = arr.length - 1;
        while (lb <= ub) {
            int mid = (lb + ub) / 2;
            // Middle element is equal to target
            if (arr[mid] == target) {
                return mid;
            }
            // Middle element is greater than target
            else if (arr[mid] > target) {
                ub = mid - 1;
            }
            // Middle element is smaller than target
            else {
                lb = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 7, 8, 9, 10 };
        System.out.println(binarySearch(arr, 19));

    }
}
