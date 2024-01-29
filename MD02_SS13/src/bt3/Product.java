package bt3;

public class Product {
    private static int nextId = 5;
    private int id;
    private String productName;
    private String description;
    private String catalog;

    public Product() {

        this.id = nextId;
        nextId++;
    }

    public Product( int id, String productName, String description, String catalog) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.catalog = catalog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }



    @Override
    public String toString() {
        return "Product[" +
                "id :" + id +
                ", productName :'" + productName + '\'' +
                ", description :'" + description + '\'' +
                ", catalog :'" + catalog + '\'' +
                ']';
    }
}
