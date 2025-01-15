// Define the structure of a node in the binary tree
class Node {
    int data;
    Node left, right;

    // Constructor to create a new node
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTree {

    // Function to find the sum of all nodes in the binary tree
    public static int sumOfNodes(Node root) {
        // Base case: If the node is null, return 0
        if (root == null) {
            return 0;
        }

        // Recursively sum the nodes in the left and right subtrees, then add the value of the current node
        return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;
    }

    public static void main(String[] args) {
        // Creating the binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Calling the function to calculate the sum of all nodes
        int totalSum = sumOfNodes(root);

        // Printing the sum of all nodes in the binary tree
        System.out.println("The sum of all nodes in the binary tree is: " + totalSum);
    }
}
