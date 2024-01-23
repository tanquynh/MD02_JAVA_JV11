package ra;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student(1,"Hung",true,20,9.5);
        System.out.println(st1.getAge());
        Person person = new Student(1,"Manh",true,21,9.5);
        System.out.println(person.toString());
    }
}
