package ra.th4;

public class Student extends Person{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    void displayInfo() {
        System.out.println("Student { Name : " + this.getName() +
                " - Age : " + this.getAge() + "}");
    }
}
