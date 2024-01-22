package ra;

public class Student extends Person {

    private  int age;
    private  double dtb;

    public Student() {
    }

    public Student(int id, String name, boolean sex, int age, double dtb) {
        super(id, name, sex);
        this.age = age;
        this.dtb = dtb;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "age=" + age +
                ", dtb=" + dtb
                ;
    }
}
