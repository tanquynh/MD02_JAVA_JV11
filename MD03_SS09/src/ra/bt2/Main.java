package ra.bt2;

public class Main {
    public static void main(String[] args) {
        IColorable[] shapes = new IColorable[2];
        shapes[0] = new Shape(15.0);
        shapes[1] = new Shape(20.0);
        System.out.println(shapes[0].getArea());
        shapes[0].howToColor();
        System.out.println(shapes[1].getArea());
        shapes[1].howToColor();
    }
}
