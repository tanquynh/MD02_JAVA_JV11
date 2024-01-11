package ra.bt5;

public class Main {
    public static void main(String[] args) {
//        BÀI TẬP
//        Tìm số nguyên dương nhỏ nhất chia hết cho 5, 7 và 11
        int number = 1;
        System.out.println("Số nguyên dương nhỏ nhất chia hết cho 5, 7 và 11 là: " + calulateLeastCommonMultiple(5, calulateLeastCommonMultiple(7,11)));
    }

    //    Hàm tìm bội số chung nhỏ nhất
    public static int calulateLeastCommonMultiple(int x, int y) {
//        tích của 2 số bằng tích của ước số chung lớn nhất và bội số chung nhỏ nhất
        return (x * y) / calculateGreatestCommonDivisor(x, y);
    }

    //    Hàm tìm ước số chung lớn nhất (thuật toán Euclid)
    public static int calculateGreatestCommonDivisor(int x, int y) {
//        dùng đệ quy
//        nếu y = 0 thì ước số chung lớn nhất là x
        if (y == 0) return x;
//        nếu y khác 0 thì ước số chung lớn nhất được tính bằng thuật toán Euclid:
//        lấy số chia đem chia cho số dư cho đến khi nào có nhận được số dư bằng 0 (trường hợp dừng), giá trị trả về cuối cùng ở trường hợp dừng sẽ là ước chung lớn nhất
        return calculateGreatestCommonDivisor(y, x % y);
    }


}
