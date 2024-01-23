package ra.bt1;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.inputData();
        circle1.displayData();

        Circle circle2 = new Circle(5.0, "black");
        circle2.displayData();
    }

}
