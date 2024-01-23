package ra.th1;

import ra.th1.animals.Animal;
import ra.th1.animals.Chicken;
import ra.th1.animals.Tiger;

public class Main {
    public static void main(String[] args) {
        Animal[] animal = new Animal [2];
        animal[0] = new Chicken();
        animal[1] = new Tiger();
        for (Animal animal1 : animal) {
            System.out.println(animal1.makeSound());
        }
    }
}
