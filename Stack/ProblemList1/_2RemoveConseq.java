import java.util.Stack;

public class _2RemoveConseq {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 4, 7, 7, 7 };
        int rem[] = remove(arr);

        //display the Array
        for (int i : rem) {
            System.out.print(i + " ");
        }
    }

    public static int[] remove(int arr[]) {

        Stack<Integer> st = new Stack<>();
        int n=arr.length;

        for (int i = 0; i < n; i++) {

            if (st.isEmpty() || st.peek() != arr[i])
                st.push(arr[i]);

            else if (i == n - 1 || arr[i] != arr[i + 1]) {
                st.pop();
            }
        }
        int remArr[] = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            remArr[i] = st.pop();
        }
        return remArr;
    }

}