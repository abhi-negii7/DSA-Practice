// Implementation of Binary Tree manually
/*
                2
              /   \
             4    10
            / \     \
           6   5     11
 */
public class _1ImplemTree {

    public static class Node {
        int val; // 0
        Node left; // null
        Node right; // null

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        Node a = new Node(4);
        Node b = new Node(3);
        Node c = new Node(6);
        Node d = new Node(2);
        Node e = new Node(1);

        root.left = a;
        root.right = b;

        a.left = c;
        a.right = d;

        b.right = e;
        // display(root);
        System.out.println("Size of tree is : " + size(root));
        System.out.println("Sum of tree node is : " + sum(root));
    }

    // 1-> Method to print the binary tree
    public static void display(Node root) {
        // Base Case
        if (root == null)
            return;
        System.out.print(root.val + "-> ");
        if (root.left != null)
            System.out.print(root.left.val + " ");
        else
            System.out.print("null ");
        if (root.right != null)
            System.out.print(root.right.val + " ");
        else
            System.out.print("null ");
        System.out.println();
        display(root.left);
        display(root.right);
    }

    // 2-> Method to find the size of binary tree
    public static int size(Node root) {
        if (root == null)
            return 0;
        return 1 + size(root.left) + size(root.right);
    }

    // 3-> Method to find the sum of tree Node
    public static int sum(Node root) {
        if (root == null)
            return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
}
