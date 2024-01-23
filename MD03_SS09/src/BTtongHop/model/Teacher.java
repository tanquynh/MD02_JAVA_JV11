package BTtongHop.model;

public class Teacher extends Entity {
//    private int teacherId;
    private String teacherName;
    private byte teacherStatus;

    public Teacher() {
    }

    public Teacher(String teacherName, byte teacherStatus) {
        this.teacherName = teacherName;
        this.teacherStatus = teacherStatus;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public byte getTeacherStatus() {
        return teacherStatus;
    }

    public void setTeacherStatus(byte teacherStatus) {
        this.teacherStatus = teacherStatus;
    }

    public void displayTeacher() {
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("ID : %-3s | Name : %-15s | teacherStatus : %-15s\n",
                getId(), teacherName,  teacherStatus == 1 ? "đang dạy":(teacherStatus == 2 ? "Nghỉ phép" :"Nghỉ việc"));
    }
}
