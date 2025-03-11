import java.util.Scanner;

public class Intro {
    public static void main(String args[]) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        // Take Array as input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\nEnter the element: ");
            arr[i] = sc.nextInt();
        }
        // print the value of Array
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }

}