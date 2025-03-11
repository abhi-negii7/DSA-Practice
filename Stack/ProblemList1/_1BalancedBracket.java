import java.util.Stack;

public class _1BalancedBracket {
    public static void main(String[] args) {
        String str = "(((()))";
        System.out.println(isBalanced(str));
    }

    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                st.push(str.charAt(i));
            } else if (str.charAt(i) == ')' && st.isEmpty()) {
                return false;
            } else if (str.charAt(i) == ')' && st.peek() == '(') {
                st.pop();
            }
        }
        if (st.isEmpty()) {
            return true;
        }
        return false;
    }
}
