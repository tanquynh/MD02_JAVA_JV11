package ra.th2;

public class Motorcycle extends Vehicle{
    public Motorcycle() {
    }

    public Motorcycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + this.getBrand() + '\'' +
                ", color='" + this.getColor() + '\'' +
                '}';
    }
}
