import java.util.*;

class Node {
    int val;
    Node left, right;

    Node(int v) {
        val = v;
        left = right = null;
    }
}

class Pair {
    Node node;
    int hd;

    Pair(Node n, int h) {
        node = n;
        hd = h;
    }
}

public class BottomView {
    public static void printBottom(Node root) {
        if (root == null) {
            return; 
        }

        Map<Integer, Integer> m = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            Node currNode = curr.node;
            int hd = curr.hd;

         
            m.put(hd, currNode.val);

            if (currNode.left != null) {
                q.add(new Pair(currNode.left, hd - 1));
            }

            if (currNode.right != null) {
                q.add(new Pair(currNode.right, hd + 1));
            }
        }

        for (int val : m.values()) {
            System.out.println(val);
        }
    }

    public static void main(String[] args) {
      
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        printBottom(root);
    }
}
