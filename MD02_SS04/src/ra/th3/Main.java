package ra.th3;

public class Main {
    public static void main(String[] args) {
        Category cg1 = new Category(1,"Quan Ao");
        Category cg2 = new Category(2,"Giay");
        Product pr1 = new Product(1,"Ao thun", 120000f, cg1);
        Product pr2 = new Product(2,"Ao thun", 120000f, cg2);
        System.out.println("Thong tin san pham");
        pr1.display();
        pr2.display();
    }

}
