import java.util.Stack;

public class _2InfixEvalBrack {

    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        infixExprBrack(str);
    }

    public static void infixExprBrack(String str) {

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57)
                val.push(ascii - 48);

            else if (op.isEmpty() || ch == '(' || op.peek() == '(')
                op.push(ch);

            else if (ch == ')') {
                while (op.peek() == ')') {
                    int v2 = val.pop();
                    int v1 = val.pop();

                    if (op.peek() == '+')
                        val.push(v1 + v2);
                    if (op.peek() == '-')
                        val.push(v1 - v2);
                    if (op.peek() == '*')
                        val.push(v1 * v2);
                    if (op.peek() == '/')
                        val.push(v1 / v2);
                    op.pop();
                }
            } else {
                if (ch == '+' || ch == '-') {
                    int v2 = val.pop();
                    int v1 = val.pop();

                    if (op.peek() == '+')
                        val.push(v1 + v2);
                    if (op.peek() == '-')
                        val.push(v1 - v2);
                    if (op.peek() == '*')
                        val.push(v1 * v2);
                    if (op.peek() == '/')
                        val.push(v1 / v2);
                    op.pop();
                } else if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if (op.peek() == '*')
                            val.push(v1 * v2);
                        if (op.peek() == '/')
                            val.push(v1 / v2);
                    }
                    op.pop();
                } else {
                    op.push(ch);
                }
            }
        }
        while (val.size() > 1) {
            int num2 = val.pop();
            int num1 = val.pop();

            if (op.peek() == '+')
                val.push(num1 + num2);
            if (op.peek() == '-')
                val.push(num1 - num2);
            if (op.peek() == '*')
                val.push(num1 * num2);
            if (op.peek() == '/')
                val.push(num1 / num2);

            op.pop();
        }

        System.out.println(val.peek());
    }
}
