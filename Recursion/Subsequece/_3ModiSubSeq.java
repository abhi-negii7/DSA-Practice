
// Printing Subsequences where sum is k
// arr[]={1,2,1} sum=2; [1,1] [2]
import java.util.ArrayList;

public class _3ModiSubSeq {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 1 };
        int sum = 2;
        ArrayList<Integer> list = new ArrayList<>();

        printSubseq(0, list, sum, 0, arr);
    }

    public static boolean printSubseq(int idx, ArrayList<Integer> list, int sum, int s, int arr[]) {

        // Base condition
        // Condition Satisfied
        if (idx == arr.length) {

            if (s == sum) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i) + " ");
                }
                System.out.println();
                return true;

            }
            return false;
        }

        // takes
        list.add(arr[idx]);
        s += arr[idx];
        if (printSubseq(idx + 1, list, sum, s, arr) == true)
            return true;

        list.remove(list.size() - 1);
        s -= arr[idx];
        if (printSubseq(idx + 1, list, sum, s, arr) == true)
            return true;
        return false;
    }
}
