// Max pair in array we can calculate it by formula n(n-1)/2
//Time Complexity - O(N^2)

public class MaxPair {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 7, 8 };

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }
}
