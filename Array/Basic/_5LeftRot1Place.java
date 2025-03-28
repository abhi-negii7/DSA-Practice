// Left Rotate the array by one place

public class _5LeftRot1Place {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        printArr(arr);
        leftRotate(arr);
        printArr(arr);
    }

    // Method to left Rotate by one
    public static void leftRotate(int arr[]) {

        int n=arr.length;
        int firEle = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n-1]=firEle;
    }

    // Print the Array
    public static void printArr(int arr[]){

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
