package BTtongHop.model;

public class Classroom extends Entity {
    private String className;
    private byte classStatus;
    private Teacher teacher;
    private Student students;
    private Subject subjects;

    public Classroom() {
    }

    public Classroom(String className, byte classStatus, Teacher teacher, Student students, Subject subjects) {
        this.className = className;
        this.classStatus = classStatus;
        this.teacher = teacher;
        this.students = students;
        this.subjects = subjects;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public byte getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(byte classStatus) {
        this.classStatus = classStatus;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    public Subject getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject subjects) {
        this.subjects = subjects;
    }

    public void displaClassroom() {
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("ID : %-3s | Name : %-15s | studentStatus : %-15s | teacherName : %-15s |\n",
                getId(), className,  classStatus == 1 ? "Chưa mở":(classStatus == 2 ? "Đang mở" :"đã hoa thành"), teacher.getTeacherName());
    }
}
