// To find the Second largest element in an array
public class _2SecondLarg {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 6, 8, 9, 1, 9, 4 };
        secLarg(arr);
    }

    public static void secLarg(int[] arr) {
        int larg = arr[0];
        int sLar = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > larg) {
                sLar = larg;
                larg = arr[i];
            } else if (arr[i] > sLar && arr[i] != larg) {
                sLar = larg;
            }
        }
        System.out.println("Second Largest Element is : " + sLar);
    }
}
