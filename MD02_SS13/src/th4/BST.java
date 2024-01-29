package th4;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {

    }

    public BST(E[] objects) {
        for (int i = 1; i < objects.length; i++) {
            insert(objects[i]);
        }
    }


    @Override
    public boolean insert(E e) {
        if (root == null) {
            // root == null, Map rong nen them vao lam root luon
            root = createNode(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                // Nếu e < vị trí current.element(vị trí rôt) thì kiểm tra nhánh bên tría
                if(e.compareTo(current.element) < 0){
                    parent = current;
                    current = current.left; // gán bằng giá trị bên trái
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false;
            }
            if(e.compareTo(parent.element) <0) {
                parent.left = createNode(e);
            } else
                parent.right = createNode(e);
        }
        size++;
        return true;
    }

    @Override
    public void inorder() {
        inorder(root);
    }
    public void inorder(TreeNode<E> root) {
        if(root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }

    @Override
    public int getSize() {
        return size;
    }

    protected TreeNode<E> createNode(E e) {
        return new TreeNode<>(e);
    }
}
