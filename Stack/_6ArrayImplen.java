public class _6ArrayImplen {
    static class Stack {
        private int arr[] = new int[5];
        private int top = -1;

        void push(int num) {
            // Check the overflow condition
            if (top == arr.length - 1) {
                System.out.println("Stack is full cannot insert " + num);
                return;
            }
            top++;
            arr[top] = num;
        }

        int pop() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return -1;
            }
            int delNum = arr[top];
            top--;
            return delNum;
        }

        void display() {
            if (top == -1) {
                System.out.println("Stack is empty cannot be displayed");
            }
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int peek(){
            if(top==-1){
                System.out.print("Stack is empty");
                return -1;
            }
            return arr[top];
        }

        boolean isEmpty() {
            if (top == -1)
                return true;
            else
                return false;
        }
        
    }

    public static void main(String args[]) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(80);
        // st.push(90);
        st.display();
        st.pop();
        System.out.println(st.peek());
        st.display();
        System.out.println(st.isEmpty());
    }
}
