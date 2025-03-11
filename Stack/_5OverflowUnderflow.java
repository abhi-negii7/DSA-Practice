// Underflow -> if stack is empty -> st.peak() or st.pop()
// -> Empty Stack Exception (Error)
import java.util.Stack;
public class _5OverflowUnderflow {
    public static void main(String[] args) {
         Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st);
        st.pop();  // Underflow
 
    }
}
