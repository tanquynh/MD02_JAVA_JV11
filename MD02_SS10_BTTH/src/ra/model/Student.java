package ra.model;

import java.util.Date;

public class Student extends Entity {
    private String studentName;
    private Date dayOfbirthDay;
    private byte studentStatus;

    public Student() {
    }

    public Student(String studentName, Date dayOfbirthDay, byte studentStatus) {
        this.studentName = studentName;
        this.dayOfbirthDay = dayOfbirthDay;
        this.studentStatus = studentStatus;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getDayOfbirthDay() {
        return dayOfbirthDay;
    }

    public void setDayOfbirthDay(Date dayOfbirthDay) {
        this.dayOfbirthDay = dayOfbirthDay;
    }

    public byte getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(byte studentStatus) {
        this.studentStatus = studentStatus;
    }
    public void displayStudent() {
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("ID : %-3s | Name : %-15s | studentStatus : %-15s\n",
                getId(), studentName,  studentStatus == 1 ? "đang học":(studentStatus == 2 ? "on job training" :"Tốt nghiệp"));
    }
}
