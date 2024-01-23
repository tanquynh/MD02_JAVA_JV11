package ra.th2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int i = 10;
        float f = 20.5f;
        boolean b = true;
        char c = 'a';
        String s = "Hà Nội";
//        thêm số vào sau % sẽ quyết định độ dài ký tự của chuỗi hiển thị
//        thêm .số vào trước f sẽ quyết định độ dài của phần thập phân được hiển thị
        System.out.printf(" i = %d\n f = %.1f\n b = %b\n c = %c\n s = %s\n", i, f, b, c, s);
    }
}