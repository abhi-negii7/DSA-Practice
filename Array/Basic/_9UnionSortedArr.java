// To do the union of two sorted array 
// Input -> arr1=[1,1,2,3,4,5]  arr2=[2,3,4,4,5,6]
// Output -> res=[1,2,3,4,5,6]

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class _9UnionSortedArr {
    public static void main(String[] args) {
        int arr1[] = { 1, 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 3, 4, 4, 5, 6 };
        // ArrayList<Integer> res=bruteUnionArr(arr1, arr2);
        ArrayList<Integer> res = optimalUnionArr(arr1, arr2);
        printArr(res);
    }

    public static ArrayList<Integer> optimalUnionArr(int[] arr1, int[] arr2) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (res.size() == 0 || (arr1[i] != res.get(res.size() - 1)))
                    res.add(arr1[i]);
                i++;
            } else {
                if (res.size() == 0 || (arr2[j] != res.get(res.size() - 1)))
                    res.add(arr2[j]);
                j++;
            }
        }
        while (i < n) {
            if (arr1[i] != res.get(res.size() - 1))
                res.add(arr1[i]);
            i++;
        }
        while (j < m) {
            if (arr2[j] != res.get(res.size() - 1))
                res.add(arr2[j]);
            j++;
        }
        return res;
    }

    // Using set
    public static ArrayList<Integer> bruteUnionArr(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        // Adding the element of array 1 to set
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        // Adding the element of array 2 to set
        for (int j = 0; j < arr2.length; j++) {
            set.add(arr2[j]);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            res.add((Integer) it.next());
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
