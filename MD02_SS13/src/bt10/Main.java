package bt10;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = new Node(10);
        bst.root.left = new Node(5);
        bst.root.right = new Node(15);
        bst.root.left.left = new Node(3);
        bst.root.left.right = new Node(7);
        bst.root.right.left = new Node(12);
        bst.root.right.right = new Node(18);

        int element = 12;
        boolean found = bst.search(element);

        if (found) {
            System.out.println("Phần tử " + element + " được tìm thấy trong cây.");
        } else {
            System.out.println("Phần tử " + element + " không tồn tại trong cây.");
        }
    }

}
