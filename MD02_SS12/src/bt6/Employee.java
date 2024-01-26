package bt6;

import java.util.Date;

public class Employee {
    private int id;
    private String fullName;
    private String gender;
    private String birthDay;

    public Employee() {
    }

    public Employee(int id, String fullName, String gender, String birthDay) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.birthDay = birthDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ']';
    }
}
