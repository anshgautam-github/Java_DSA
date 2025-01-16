class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class InsertInBST {

    public static Node insert(Node root, int key) {
        Node nn = new Node(key); 
        if (root == null) return nn; 

        Node curr = root; 
        while (true) {
            if (key < curr.val) {
                if (curr.left == null) {
                    curr.left = nn;
                    break;
                } else {
                    curr = curr.left;
                }
            } else { 
                if (curr.right == null) {
                    curr.right = nn;
                    break;
                } else {
                    curr = curr.right; 
                }
            }
        }
        return root;
    }
}
