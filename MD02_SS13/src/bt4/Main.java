package bt4;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = new TreeNode(27);
        tree.root.left = new TreeNode(14);
        tree.root.right = new TreeNode(35);
        tree.root.left.left = new TreeNode(10);
        tree.root.left.right = new TreeNode(19);
        tree.root.right.left = new TreeNode(31);
        tree.root.right.right = new TreeNode(42);

        System.out.println("Duyệt theo thứ tự postorder:");
        tree.postorderTraversal(tree.root);
    }
}
