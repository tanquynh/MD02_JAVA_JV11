package ra.th8;

public class Main {
    public static void main(String[] args) {
        Student.change();
        Student st1 = new Student(111,"Tuan");
        Student st2 = new Student(222,"Manh");
        Student st3 = new Student(333,"Hai");
        st1.display();
        st2.display();
        st3.display();
    }
}
