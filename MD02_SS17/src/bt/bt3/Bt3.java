package bt.bt3;

public class Bt3 {
    public static void calculateArray(double[] array) {
        int sum = 0;
        for (double number : array) {
            if (number % 1 != 0) {
                try {
                    throw new Exception("Giá trị " + number + " không phải số nguyên");

                } catch (Exception e) {
                    System.out.println("Lỗi: " + e.getMessage());
                    continue;
                }
            }
            sum += number;
        }
        System.out.println("Tổng các số nguyên trong mảng là " + sum);
    }

    public static void main(String[] args) {
        double[] arr = {1, 2.5, 3, 5, 7.1};
        calculateArray(arr);
    }
}
