package bt12;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList myList = new MyList();

        // Thêm phần tử vào danh sách
        myList.add("Element 1");
        myList.add("Element 2");
        myList.add("Element 3");
        System.out.println("Danh sách sau khi thêm phần tử: " + myList.size());
//
//        // Kiểm tra xem danh sách có trống hay không
//        System.out.println("Danh sách trống? " + myList.isEmpty());

        // Lấy phần tử từ danh sách
        System.out.println("Phần tử tại vị trí 1: " + myList.get(1));

        // Xóa phần tử khỏi danh sách
        myList.remove(0);
        System.out.println(" xóa phần tử: " + myList.remove(0));

        // Kiểm tra xem một phần tử có tồn tại trong danh sách hay không
        System.out.println("Có phần tử 'Element 2' trong danh sách? " + myList.contains("Element 2"));

//        // Xóa toàn bộ danh sách
        myList.clear();
        System.out.println("Danh sách sau khi xóa toàn bộ: " + myList.size());
//    }
    }
}
