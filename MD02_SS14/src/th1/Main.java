package th1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        Rectangle rectangle = new Rectangle(4.5,6);
        System.out.println(circle.area());
        System.out.println(rectangle.area());
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle(5.6));
        shapeList.add(new Rectangle(5.6, 6.7));
        for (Shape shape : shapeList) {
            System.out.println(shape.area());
        }
    }
}
