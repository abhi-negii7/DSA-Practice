// Intersection of two sorted Arrays
// Input -> a = [1, 2, 2, 3, 3, 3, 4, 5, 6]  &  b = [2, 3, 3, 5, 6, 6, 7]
// Output -> res = [2, 3, 3, 5, 6]

import java.util.ArrayList;

public class _10IntersecSortArr {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 3, 3, 4, 5, 6 };
        int brr[] = { 2, 3, 3, 5, 6, 6, 7 };

        // ArrayList<Integer> res = optInterSortArr(arr, brr);
        ArrayList<Integer> res = bruteInterSortArr(arr, brr);
        printArr(res);
    }

    // Optimal Approach -> Using Two pointer
    public static ArrayList<Integer> optInterSortArr(int[] arr, int[] brr) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr.length && j < brr.length) {
            if (arr[i] < brr[j])
                i++;
            else if (arr[i] > brr[j])
                j++;
            else {
                res.add(arr[i]);
                i++;
                j++;
            }
        }
        return res;
    }

    // BruteForce Appraoch using visited Array
    public static ArrayList<Integer> bruteInterSortArr(int[] arr, int[] brr) {
        ArrayList<Integer> res = new ArrayList<>();

        int n = Math.min(arr.length, brr.length);
        // visited Array
        int[] vis = new int[n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                if (arr[i] < brr[j])
                    break;
                if (arr[i] == brr[j] && vis[j] == 0) {
                    res.add(arr[i]);
                    vis[j] = 1;
                    break;
                }
            }
        }
        return res;
    }

    // Method to Print the Array element
    public static void printArr(ArrayList<Integer> res) {
        for (Integer i : res) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
