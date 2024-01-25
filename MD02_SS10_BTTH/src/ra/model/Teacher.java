package ra.model;

public class Teacher extends Entity {
    private String teacherName;
    private byte techerStatus;

    public Teacher() {
    }

    public Teacher(String teacherName, byte techerStatus) {
        this.teacherName = teacherName;
        this.techerStatus = techerStatus;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public byte getTecherStatus() {
        return techerStatus;
    }

    public void setTecherStatus(byte techerStatus) {
        this.techerStatus = techerStatus;
    }
    public void displayTeacher() {
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("ID : %-3s | Name : %-15s | teacherStatus : %-15s\n",
                getId(), teacherName,  techerStatus == 1 ? "đang dạy":(techerStatus == 2 ? "Nghỉ phép" :"Nghỉ việc"));
    }
}
