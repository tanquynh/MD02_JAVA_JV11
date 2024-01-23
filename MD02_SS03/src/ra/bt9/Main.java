package ra.bt9;

public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 2, 4, 5, 4, 9};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max2 = max;
                max = j;
            } else if (j > max2 && j != max){
                max2 = j;
            }
        }
        System.out.println("Phần tử lớn thứ hai trong mảng là: " + max2);
    }
}
