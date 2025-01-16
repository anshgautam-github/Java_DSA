public boolean SearchKInBST(Node root, int key) {
    if (root == null) return false; 

    if (key < root.value) {
        return search(root.left, key);
    } else if (key > root.value) {
        return search(root.right, key);
    }

    return true;
}
