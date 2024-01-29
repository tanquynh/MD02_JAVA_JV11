package bt6;



public class BSTDeleteOperation {
    public TreeNode root;

    public BSTDeleteOperation() {
        root = null;
    }

    // Gọi hàm xoá với giá trị cần xoá
    public boolean delete(int key) {
        return deleteNode(root, key);
    }

    // Hàm xoá node trong BST
    private boolean deleteNode(TreeNode root, int key) {
        // Tìm node chứa giá trị cần xoá
        TreeNode current = root;
        TreeNode parent = null;

        while (current != null && current.key != key) {
            parent = current;
            if (key < current.key) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        // Nếu không tìm thấy node chứa giá trị cần xoá
        if (current == null) {
            return false;
        }

        // Trường hợp 1: Node không có node con trái
        if (current.left == null) {
            if (parent == null) {
                // Nếu node cần xoá là root
                root = current.right;
            } else {
                // Nếu node cần xoá không phải root
                if (key < parent.key) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        }
        // Trường hợp 2: Node có node con trái
        else {
            // Tìm node phải nhất trong cây con trái của node cần xoá
            TreeNode rightMost = current.left;
            TreeNode parentOfRightMost = current;

            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right;
            }

            // Copy giá trị của node phải nhất vào node cần xoá
            current.key = rightMost.key;

            // Kết nối parentOfRightMost với left child của rightMost
            if (parentOfRightMost.left == rightMost) {
                parentOfRightMost.left = rightMost.left;
            } else {
                parentOfRightMost.right = rightMost.left;
            }
        }

        return true;
    }

    // Thêm một giá trị vào BST
    public void insert(int key) {
        root = insertNode(root, key);
    }

    // Hàm chèn một giá trị vào BST
    private TreeNode insertNode(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);
        }

        if (key < root.key) {
            root.left = insertNode(root.left, key);
        } else if (key > root.key) {
            root.right = insertNode(root.right, key);
        }

        return root;
    }

    // Hiển thị cây theo thứ tự in-order
    public void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.key + " ");
            inOrderTraversal(root.right);
        }
    }
}
