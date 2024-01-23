package ra.th2;

public class ComparableCircle extends Circle implements java.lang.Comparable<ComparableCircle>{
    public ComparableCircle() {
    }


    public ComparableCircle(double radius) {
        super(radius);
    }


    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }


    @Override
    public int compareTo(ComparableCircle o) {
        return Double.compare(getRadius(), o.getRadius());
    }
}
