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

public class RightView {

    public static void printRight(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>(); 
        q.add(root);

        while (!q.isEmpty()) {
            int length = q.size();

            for (int i = 0; i < length; i++) {
                Node curr = q.poll(); 

                if (i == length - 1) {
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

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        printRight(root);
    }
}
