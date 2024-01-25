package ra.model;

public class Subject extends Entity{
    private String subjectName;
    private boolean subjectStatus;

    public Subject() {
    }

    public Subject(String subjectName, boolean subjectStatus) {
        this.subjectName = subjectName;
        this.subjectStatus = subjectStatus;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public boolean isSubjectStatus() {
        return subjectStatus;
    }

    public void setSubjectStatus(boolean subjectStatus) {
        this.subjectStatus = subjectStatus;
    }
    public void displaySubject() {
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("ID : %-3s | SubjectName : %-15s | subjectStatus : %-15s\n",
                getId(), subjectName,  subjectStatus ? "đang mở":"Đã khóa");
    }
}
