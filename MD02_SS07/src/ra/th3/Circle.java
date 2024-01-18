package ra.th3;

public class Circle extends Shape{
    private double radius = 1.0;
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(double radius) {
        return this.radius * this.radius *Math.PI;
    }
    public double getPerimeter(double radius) {
        return 2 * Math.PI *this.radius;
    }
    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius()+" , which is a subclass of "+ super.toString();
    }
}
