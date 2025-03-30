// Right Rotate the Array 
// Example - [1,2,3,4,5,6,7] d=3
// Output - [5,6,7,1,2,3,4]

public class _7RightRotate {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 3;
        printArr(arr);
        rotateRight(arr, d);
        printArr(arr);
    }

    public static void rotateRight(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
    }

    // Reverse the Array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Print Array elements
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}