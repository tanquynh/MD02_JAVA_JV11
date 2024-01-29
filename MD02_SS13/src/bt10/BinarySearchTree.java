package bt10;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public boolean search(int element) {
        Node current = root;
        while (current != null && current.value != element) {
            if(element < current.value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        if(current != null) {
            return true;
        } else return false;
    }
}
