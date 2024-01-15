package ra.bt1;

import static java.lang.Math.PI;

public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
     }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return this.radius*this.radius*PI;
    }
    public double getPerimeter() {
        return 2*PI*this.radius;
    }

    public void displayData() {
        System.out.println("Ban kinh : "+getRadius() + " Co Chu vi :" + getPerimeter() + " Dien tich :" + getArea());
    }
}
