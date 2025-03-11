public class MaxSumSubArr {
    public static void maxSubArrSum(int arr[]) {
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = 0; j < arr.length; j++) {
                int end = j;
                int currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += arr[k];
                }
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.print("Max Sum of the subarray is : " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 11, 78, 5, 9 };
        maxSubArrSum(arr);
    }
}
