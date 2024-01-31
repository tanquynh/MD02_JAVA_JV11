package bthop.controller;

import bthop.config.InputMethod;
import bthop.model.Department;
import bthop.model.Employee;
import bthop.service.DepartmentService;
import bthop.service.EmployeeService;

import java.util.List;

public class EmployeeController {
    EmployeeService employeeService = new EmployeeService();
    DepartmentService departmentService = new DepartmentService();

    public void displayEmployeeManagement() {
        while (true) {
            System.out.println("-------------------DEPARTMENT-MANAGEMENT----------------");
            System.out.println("1. HIển thị danh sách thông tin tất cả nhân viên(mã nhân viên và tên)\n" +
                    "2. Xem chi tiết thông tin nhân viên theo mã nhân viên (toàn bộ thông tin)\n" +
                    "3. Thêm mới nhân viên\n" +
                    "4. Chỉnh sửa thông tin nhân viên\n" +
                    "5. Xóa nhân viên \n" +
                    "6. Thống kê số lượng nhân viên trung bình của mỗi phòng \n" +
                    "7. Tìm ra 5 phòng có số lượng nhân viên đông nhất\n" +
                    "8. Tìm ra người quản lý nhiều  nhân viên nhất\n" +
                    "9. Tìm ra 5 nhân viên có tuổi cao nhất công ty\n" +
                    "10. Tìm ra 5 nhân viên hưởng lương cao nhất\n" +
                    "11.Thoát");
            System.out.println("Nhap lua chon");
            byte choice = InputMethod.getByte();
            switch (choice) {
                case 1:
                    employeeService.displayEmployeeInfor();
                    break;
                case 2:
                    employeeService.displayEmployee();
                    break;
                case 3:
                    employeeService.addEmployee();
                    break;
                case 4:
                    employeeService.editEmployee();
                    break;

                case 5:
                    employeeService.deleteEmployee();
                    break;
                case 6:
                    employeeService.averageEmployeesPerDepartment();
                    break;
                case 7:
                    employeeService.top5DepartmentsByEmployeeCount();
                    break;
                case 8:
                    employeeService.managerWithMostEmployees();
                    break;
                case 9:
                    employeeService.top5OldestEmployees();
                    break;
                case 10:
                    employeeService.top5HighestPaidEmployees();
                    break;
                case 11:
                    return;
                default:
                    System.out.println("Lua chon khong dung moi nhap lai");

            }

        }
    }
}
