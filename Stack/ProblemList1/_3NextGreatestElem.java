import java.util.Stack;

public class _3NextGreatestElem {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 1, 8, 6, 3, 4 };
        // int res[]=usingArr(arr);
        display(arr);
        // display(res);
        int res[] = usingStack(arr);
        display(res);
    }

    // Time Complexity -> O(N^2) Space Complexity -> O(1)
    public static int[] usingArr(int arr[]) {
        int res[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i] = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    res[i] = arr[j];
                    break;
                }
            }
        }
        return res;
    }

    // Time Complexity -> O(N) Space Complexity -> O(N)
    public static int[] usingStack(int arr[]) {
        int n = arr.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n - 1]);
        res[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() < arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
                st.push(arr[i]);
            } else if (st.peek() > arr[i]) {
                res[i] = st.peek();
            }
        }
        return res;
    }

    public static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
