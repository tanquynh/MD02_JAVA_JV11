package ra.th3;

public class Product {
    private int productid;
    private String productName;
    private float productPrice;
    private Category category;

    public Product() {
    }

    public Product(int productid, String productName, float productPrice, Category category) {
        this.productid = productid;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    public void display() {
        System.out.println("Ma san pham :" + productid + "\n" +
                "Ten san pham :" + productName + "\n" +
                "Gia san pham :" + productPrice + "\n" +
                "Loai danh muc :" + category.getCategoryName() + "\n"
        );
    }
}
