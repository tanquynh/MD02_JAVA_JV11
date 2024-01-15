package ra.th7;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ten :" + StaticMethod.name);
        System.out.println("Tuoi :" + StaticMethod.age);
        StaticMethod.showInfo();
        StaticMethod staticMethod = new StaticMethod();
        System.out.println("Ten :" + staticMethod.name);
        System.out.println("Tuoi :" + staticMethod.age);
    }
}
