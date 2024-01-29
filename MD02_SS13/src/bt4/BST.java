package bt4;

public class BST {
    TreeNode root;

    public BST() {
        root = null;
    }

    // Duyệt theo thứ tự postorder
    public void postorderTraversal(TreeNode node) {
        if (node == null)
            return;

        // Duyệt cây con bên trái
        postorderTraversal(node.left);

        // Duyệt cây con bên phải
        postorderTraversal(node.right);

        // Truy cập nút gốc
        System.out.print(node.key + " ");
    }
}
