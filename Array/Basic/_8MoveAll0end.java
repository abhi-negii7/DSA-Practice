// To move all the zeros from the array to the end
// Input -> arr=[1,0,2,3,2,0,0,4,5,1,0]
// Output -> arr=[1,2,3,2,4,5,1,0,0,0,0]

public class _8MoveAll0end {

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1, 0 };
        printArr(arr);
        moveAllZero(arr);
        printArr(arr);
    }

    // Using 2 pointers
    public static void moveAllZero(int[] arr) {

        int i;
        // detect the position of first zero
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                break;
        }
        

        for (int j = i + i; j < arr.length; j++) {
            // if we counter a number as non zero swap with the positon of zero element and increment
            if (arr[j] != 0) {
                swap(arr, i, j);
                i++;
            }
        }
    }

    // Method to Swap the two numbers
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Method to Print the Array element
    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}