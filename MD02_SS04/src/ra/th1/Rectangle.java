package ra.th1;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return this.height*this.width;
    }
    public double getPerimeter() {
        return (this.height + this.width)*2;
    }


   public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
   }

}
