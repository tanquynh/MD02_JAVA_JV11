package ra.th1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Pig");
        Dog dog1 = new Dog("Becgie", "black");
        Dog dog2 = new Dog("Pug", "White");
        Cat cat = new Cat("Dora");
        System.out.println("animal's name is " +animal.getName());
        animal.setName("Bird");
        System.out.println("animal's name is " +animal.getName());
        dog1.setName("Corgi");
        System.out.println("Name : " + dog1.getName());
        System.out.println("Sound : " + dog1.makeSound());
        System.out.println("Name : " + dog2.getName());
        System.out.println("Sound : " + dog2.makeSound());
        System.out.println("Name : " + cat.getName());
        System.out.println("Sound : " + cat.makeSound());
    }
}
