package ra.model;

import java.util.List;

public class Classes extends Entity{
    private String className;
    private Teacher teacher;
    private byte classStatus;
    private List<Student> students;
    private List<Subject> subjects;

    public Classes() {
    }

    public Classes(String className, Teacher teacher, byte classStatus, List<Student> students, List<Subject> subjects) {
        this.className = className;
        this.teacher = teacher;
        this.classStatus = classStatus;
        this.students = students;
        this.subjects = subjects;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public byte getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(byte classStatus) {
        this.classStatus = classStatus;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
    public void displayClassroom() {
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("ID : %-3s | Name : %-15s | studentStatus : %-15s | teacherName : %-15s |\n",
                getId(), className,  classStatus == 1 ? "Chưa mở":(classStatus == 2 ? "Đang mở" :"đã hoa thành"), teacher.getTeacherName());
    }
}
