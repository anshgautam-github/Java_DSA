
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class SumOfNodes {

    public static int sumOfNodes(Node root) {
    
        if (root == null) {
            return 0;
        }

        return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;
    }

    public static void main(String[] args) {
    
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int totalSum = sumOfNodes(root);
        System.out.println(totalSum);
    }
}
