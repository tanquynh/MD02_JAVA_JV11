package ra.th6;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Nguyen Vam", "Nam", 18,true);
        Person p2 = new Person("Nguyen Thi", "Van", 20,false);
        System.out.println(p1.getFirstName());
        System.out.println("Name p2 : " + p2.getFirstName() + " " + p2.getLastName());

    }
}
