// Problem -> Insert at any index

import java.util.Stack;

public class _4InsertAtIdx {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(4);
        st.push(7);
        st.push(23);
        st.push(43);
        System.out.println(st);
        int idx = 3;
        int x = 10;
        Stack<Integer> temp = new Stack<>();
        while (st.size() > idx) {
            temp.push(st.pop());
        }
        st.push(x);
        while (temp.size() > 0) {
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
