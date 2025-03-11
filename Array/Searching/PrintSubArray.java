public class PrintSubArray {
    public static void printSubArr(int arr[]) {
        // To store the total number of total sub Array
        int totalsubArr = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                int end = j;
                // To print the sub Array
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                System.out.print(" sum=" + sum);
                totalsubArr++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub Array are = " + totalsubArr);

    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 };

        printSubArr(arr);
    }
}
