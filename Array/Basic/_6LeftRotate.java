public class _6LeftRotate {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 2;
        printArr(arr);
        leftRotate(arr, d);
        printArr(arr);
    }

    public static void leftRotate(int[] arr, int d) {

        d = d % arr.length;
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    // Reverse the array
    public static void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Print the Array
    public static void printArr(int arr[]) {

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
