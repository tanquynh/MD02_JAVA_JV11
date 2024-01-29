package bt6;

public class Main {
    public static void main(String[] args) {
        BSTDeleteOperation bst = new BSTDeleteOperation();

        // Thêm các giá trị vào cây
        bst.insert(15);
        bst.insert(7);
        bst.insert(23);
        bst.insert(3);
        bst.insert(11);
        bst.insert(19);
        bst.insert(27);

        System.out.println("Cây trước khi xoá:");
        bst.inOrderTraversal(bst.root);
        System.out.println();

        // Xoá node có giá trị 7
        bst.delete(7);

        System.out.println("Cây sau khi xoá:");
        bst.inOrderTraversal(bst.root);
    }
}
