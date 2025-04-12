// Remove the duplicate from the array 
// Input -> 3,2,9,3,1,2,5,9
// Ouput -> 3,2,9,1,5

import java.util.*;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int arr[] = { 3, 2, 9, 3, 1, 2, 5, 9 };
        int[] answer = removeDupli(arr);
        printArr(answer);
    }

    public static int[] removeDupli(int arr[]) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = 0;
        int answer[] = new int[set.size()];
        for (int i : set) {
            answer[k] = i;
            k++;

        }
        return answer;
    }

    public static void printArr(int[] answer) {
        for (int i : answer) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}