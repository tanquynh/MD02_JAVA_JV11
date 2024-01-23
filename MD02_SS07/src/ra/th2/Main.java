package ra.th2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Black");
        Car car2 = new Car("Ford", "While");
        System.out.println("Car's brand is " + car1.getBrand());
        car1.setColor("yellow");
        System.out.println(car1);
        System.out.println(car2);
        Motorcycle morto1 =new Motorcycle("Honda", "red-while");
        Motorcycle morto2 = new Motorcycle("Vinfast", "blue");
        System.out.println(morto1);
        System.out.println(morto2);

    }

}
