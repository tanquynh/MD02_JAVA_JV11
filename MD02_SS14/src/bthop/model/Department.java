package bthop.model;

import java.util.List;

public class Department extends Entity {
    private String departmentId ;
    private String departmentName;
    private List<Employee> employeeList;
    private int totalMembers;
    public Department() {
    }

    public Department(String departmentId, String departmentName, List<Employee> employeeList, int totalMembers) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.employeeList = employeeList;
        this.totalMembers = totalMembers;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getTotalMembers() {
        return totalMembers;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void setTotalMembers(int totalMembers) {
        this.totalMembers = totalMembers;
    }
    public void displayDepartment() {
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("ID : %-3s | Name : %-15s | TotalMembers : %-15s |\n",
                departmentId, departmentName,  totalMembers );
    }
    public void displayEmployeeInDepartment() {
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("ID : %-3s |  TotalMembers : %-15s |\n",
                departmentId,   totalMembers );
    }

}
