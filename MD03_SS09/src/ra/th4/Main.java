package ra.th4;

public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[2];
        person[0] = new Student("Tuan", 21);
        person[1] = new Teacher("Manh", 31);
        person[0].displayInfo();
        person[1].displayInfo();
    }

}
