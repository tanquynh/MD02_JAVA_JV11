package ra.bt7;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("Lop 12A1");
        System.out.println("Gia tri ban dau myString :" + myClass.getMyString());
       myClass.setMyString("Lop 12C1");
        System.out.println("Gia tri moi myString :" + myClass.getMyString());

    }
}
