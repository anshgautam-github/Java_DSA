import java.util.*;

class Node {
    int value;
    Node left, right;

    Node(int val) {
        value = val;
        left = null;
        right = null;
    }
}

public class LeftView {

    public static void printLeft(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                Node curr = q.poll();
                if (i == 0) {
                    System.out.println(curr.value);
                }

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example Tree:
        //         1
        //        / \
        //       2   3
        //      / \
        //     4   5
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        printLeft(root);
    }
}
