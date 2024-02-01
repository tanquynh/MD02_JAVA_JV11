package bt2;

public class Student {
    private int id;
    private String Name;
    private double Score;

    public Student() {

    }

    public Student(int id, String name, double score) {
        this.id = id;
        Name = name;
        Score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "Student[" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Score=" + Score +
                ']';
    }
}
