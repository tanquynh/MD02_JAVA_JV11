package ra.bt8;

public class Main {
    public static void main(String[] args) {

        // Tính diện tích hình tròn
        double circle1Area = StaticMethod.calCircleArea(3.5);
        double circle2Area = StaticMethod.calCircleArea(6);
        System.out.println("Diện tích hình tròn 1: " + circle1Area);
        System.out.println("Diện tích hình tròn 2: " + circle2Area);

        // Tính diện tích hình tam giác
        double triangle1Area = StaticMethod.calTriangleArea(3, 4, 5);
        double triangle2Area = StaticMethod.calTriangleArea(4.5, 7, 6);
        System.out.println("Diện tích hình tam giác 1: " + triangle1Area);
        System.out.println("Diện tích hình tam giác 2: " + triangle2Area);

        // Tính diện tích hình chữ nhật
        double rectangle1Area = StaticMethod.calRectangleArea(2.5, 6);
        double rectangle2Area = StaticMethod.calRectangleArea(4, 7);
        System.out.println("Diện tích hình chữ nhật 1: " + rectangle1Area);
        System.out.println("Diện tích hình chữ nhật 2: " + rectangle2Area);
    }

}
