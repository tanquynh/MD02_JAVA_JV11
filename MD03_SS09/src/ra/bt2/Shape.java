package ra.bt2;

public class Shape implements IColorable{
    private double sides;

    public Shape() {
    }

    public Shape(double sides) {
        this.sides = sides;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }


    @Override
    public double getArea() {
        return sides * sides;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
