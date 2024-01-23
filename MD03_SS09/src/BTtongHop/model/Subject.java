package BTtongHop.model;

public class Subject extends Entity {
//    private int subjectId;
    private String sunjectName;
    private boolean subjectStatus;

    public Subject() {
    }

    public Subject( String sunjectName, boolean subjectStatus) {
        this.sunjectName = sunjectName;
        this.subjectStatus = subjectStatus;
    }



    public String getSunjectName() {
        return sunjectName;
    }

    public void setSunjectName(String sunjectName) {
        this.sunjectName = sunjectName;
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
                getId(), sunjectName,  subjectStatus ? "đang mở":"Đã khóa");
    }
}
