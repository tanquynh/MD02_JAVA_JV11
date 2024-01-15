package ra.bt9;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Bán kính của circle1: " + circle1.getRadius());
        System.out.println("Diện tích của circle1: " + circle1.getArea());

        Circle circle2 = new Circle(2.5);
        System.out.println("Bán kính của circle2: " + circle2.getRadius());
        System.out.println("Diện tích của circle2: " + circle2.getArea());
    }
}
