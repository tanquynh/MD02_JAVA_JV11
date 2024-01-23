package ra.th4;

public class Teacher extends Person{
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    void displayInfo() {
        System.out.println("Teacher { Name : " + this.getName() +
                " - Age : " + this.getAge() + "}");
    }
}
