package ra.bt4;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("red",1.5);
        shapes[1] = new Rectangle("blue",2.5,3.5);
        System.out.println(shapes[0].getArea());
        shapes[0].display();
        System.out.println(shapes[1].getArea());
        shapes[1].display();
    }
}
