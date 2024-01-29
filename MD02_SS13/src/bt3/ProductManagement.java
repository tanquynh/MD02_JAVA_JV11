package bt3;

import java.util.*;

public class ProductManagement {


    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Ao Phong", "Ao dep nhi", "Ao"));
        productList.add(new Product(2, "Ip13", "ip dep", "Dien thoai"));
        productList.add(new Product(3, "S20", "sam sung", "Dien Thoai"));
        productList.add(new Product(4, "Laptop Dell", "Lap top dep", "Lap top"));

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("------------------------MENU------------------------");
            System.out.println("1.Hien thi danh sach san pham");
            System.out.println("2.Them san pham");
            System.out.println("3.Sua san pham");
            System.out.println("4.Xoa san pham");
            System.out.println("5.Tim kiem san pham theo ten");
            System.out.println("6.Xap sep san pham theo ten");
            System.out.println("0.Thoat khoi chuong tring");
            System.out.println("Nhap slua chon");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    displayProduct(productList);
                    break;
                case 2:
                    addProduct(productList, sc);
                case 3:
                    editProduct(productList, sc);
                case 4:
                    deleteProduct(productList, sc);
                case 5:
                    searchByName(productList, sc);
                case 6:
                    sortByName(productList, sc);
                case 0 :
                    return;
                default:
                    System.out.println("Lua chon khong dung moi nhap lai");
            }
        }


    }

    private static void sortByName(List<Product> productList, Scanner sc) {
        Collections.sort(productList,(a, b) -> a.getProductName().compareTo(b.getProductName()));
    }

    private static void searchByName(List<Product> productList, Scanner sc) {
        System.out.println("Nhap ten can tim kiem");
        String name = sc.nextLine();
        for (Product product : productList) {
            if (product.getProductName().equalsIgnoreCase(name)) {
                System.out.println(product.getId() + " - " + product.getProductName() + " - $" );
            }
        }
    }

    private static void deleteProduct(List<Product> productList, Scanner sc) {
        System.out.println("Nhap id");
        int id = Integer.parseInt(sc.nextLine());
        Iterator<Product> iterator = productList.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId() == id) {
                iterator.remove();
                break;
            }
        }
    }

    private static void editProduct(List<Product> productList, Scanner sc) {
        System.out.println("Nhap id");
        int id = Integer.parseInt(sc.nextLine());
        boolean flag = false;
        for (Product p : productList) {
            if (p.getId() == id) {
                System.out.println("Nhap ten");
                p.setProductName(sc.nextLine());
                System.out.println("Nhap description");
                p.setDescription(sc.nextLine());
                System.out.println("Nhap Catalog");
                p.setCatalog(sc.nextLine());
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        if(flag) {
            System.out.println("Chinh sua thong tin thanh cong");
        } else {
            System.out.println("id nhap vao khong trung");
        }
    }

    private static void addProduct(List<Product> productList, Scanner sc) {
        System.out.println("Nhap so luong can them moi");
        int numberOfproduct = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberOfproduct; i++) {
            Product product = new Product();
            System.out.println("Nhap ten san pham");
            product.setProductName(sc.nextLine());
            System.out.println("Nhap ten mo ta");
            product.setDescription(sc.nextLine());
            System.out.println("Nhap ten catalog");
            product.setCatalog(sc.nextLine());
            productList.add(product);
        }

    }

    private static void displayProduct(List<Product> productList) {
        if (productList.isEmpty()) {
            System.err.println("Danh sach san pham rong");
        } else {
            System.out.println("Danh sach san pham");
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }
}
