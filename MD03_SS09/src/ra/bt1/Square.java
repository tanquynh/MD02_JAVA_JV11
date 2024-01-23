package ra.bt1;

public class Square implements IResizeable {
   private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea() {
         return  side * side;
    }
    @Override
    public void Resize(double percent) {
        side *= percent;
    }
}
