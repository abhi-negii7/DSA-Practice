import java.util.Stack;

public class _1InfixEval {
    public static void main(String[] args) {
        String str = "8-5+3*4/6";
        infixExpression(str);
    }

    public static void infixExpression(String str) {

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int ascii = (int) ch;

            // ASCII value 0 -> 48 and 9 -> 57
            if (ascii >= 48 && ascii <= 57)
                val.push(ascii - 48);

            else if (op.size() == 0)
                op.push(ch);

            else {

                if ((ch == '+') || (ch == '-')) {

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
                    op.push(ch);
                }
                else if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        int num2 = val.pop();
                        int num1 = val.pop();

                        if (op.peek() == '*')
                            val.push(num1 * num2);
                        if (op.peek() == '/')
                            val.push(num1 / num2);

                        op.pop();
                        op.push(ch);
                    } else
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