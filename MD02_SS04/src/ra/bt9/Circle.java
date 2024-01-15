package ra.bt9;

public class Circle {
    private double radius ;
    private String color ;

    public Circle() {
        radius = 1;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius *radius;
    }
}
