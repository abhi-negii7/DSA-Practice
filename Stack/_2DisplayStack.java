import java.util.Scanner;
import java.util.Stack;

public class _2DisplayStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(4);
        st.push(5);
        st.push(8);
        st.push(20);
        st.push(30);
        int n = st.size();
        display(st, n);
        // displayReverseRec(st);
        // removeFromBottom(st);
        // System.out.print("Enter the number to insert at bottom : ");
        // int num=sc.nextInt();
        // pushAtBottom(st,num);
        reverseStackRec(st);
        displayRec(st);
    }

    // Display the stack using the iterative method
    public static void display(Stack<Integer> st, int n) {
        int arr[] = new int[n];
        int i = n - 1;
        while (st.size() > 0) {
            arr[i] = st.pop();
            i--;
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            st.push(arr[i]);
        }
        System.out.println();
    }

    // display the stack in reverse order using recursion
    public static void displayReverseRec(Stack<Integer> st) {
        if(st.size()==0)
        return ;
        int top=st.pop();
        System.out.print(top+" ");
        displayReverseRec(st);
        st.push(top);
    }
    //display the stack using recursion
    public static void displayRec(Stack<Integer> st) {
        if (st.size() == 0)
            return;
        int top = st.pop();
        displayRec(st);
        System.out.print(top + " ");
        st.push(top);
    }
    //push at bottom using recursion
    public static void pushAtBottom(Stack<Integer> st,int num){
        if(st.size()==0){
            st.push(num);
            return;
        }
        int top=st.pop();
        pushAtBottom(st,num);
        st.push(top);
    }



    // remove from bottom/any index 1 stack
    public static void removeFromBottom(Stack<Integer> st){
        if(st.size()==1){
            st.pop();
            return;
        }
        int top=st.pop();
        removeFromBottom(st);
        st.push(top);
    }
    //reverse stack recursively
    public static void reverseStackRec(Stack<Integer> st){
        if(st.size()==1)
            return;
        int top=st.pop();
        reverseStackRec(st);
        pushAtBottom(st, top);
    }
    //reverse stack 2 stack
}
