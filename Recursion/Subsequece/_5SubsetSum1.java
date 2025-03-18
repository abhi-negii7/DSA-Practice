
// Subset sum 1 -> GFG
// Given a array arr of integers, return the sums of all subsets in the list . Return the result ArrayList in shorted order
// [3,1,2] -> []->0 , [3]->3, [1]->1, [2]->2, [3,1]->4, [3,2]->5, [1,2]->3, [3,1,2]->6
// [0,1,2,3,3,4,5,6]

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _5SubsetSum1 {
    public static void main(String[] args) {
        //Given
        int arr[]={3,1,2};

        List<Integer> res=new ArrayList<>();
        subSetSum(0, res, arr, 0);

        Collections.sort(res);
        System.out.println(res);
    }

    public static void subSetSum(int idx, List<Integer> res, int arr[], int sum) {

        //Base Case
        if(idx==arr.length){
            res.add(sum);
            return;
        }

        // Pick 
        subSetSum(idx+1, res, arr, sum+arr[idx]);

        //Not Pick
        subSetSum(idx + 1, res, arr, sum);
    }
}
