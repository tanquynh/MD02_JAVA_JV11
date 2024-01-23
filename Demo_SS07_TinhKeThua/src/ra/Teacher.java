package ra;

public class Teacher extends Person {
    private String level;

    @Override
    public String toString() {
        return super.toString();
    }

    public Teacher() {
    }

    public Teacher(int id, String name, boolean sex, String level) {
        super(id, name, sex);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
