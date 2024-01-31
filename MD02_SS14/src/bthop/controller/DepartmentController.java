package bthop.controller;

import bthop.config.InputMethod;
import bthop.service.DepartmentService;

public class DepartmentController {
    DepartmentService departmentService = new DepartmentService();

    public void displayDepartmentManagement() {
        while (true) {
            System.out.println("-------------------DEPARTMENT-MANAGEMENT----------------");
            System.out.println("1.Hiển thị danh sách phòng ban\n" +
                    "2.Thêm mới phòng ban\n" +
                    "3.Chỉnh sửa tên phòng ban\n" +
                    "4.Hiển thị danh sách nhân viên của phòng ban theo mã phòng\n" +
                    "5.Xóa phòng ban (chỉ xóa khi ko có nhân viên nào)\n" +
                    "6.Thoát");
            System.out.println("Nhap lua chon");
            byte choice = InputMethod.getByte();
            switch (choice) {
                case 1:
                    departmentService.displayDepartment();
                    break;
                case 2:
                    departmentService.addDepartment();
                    break;
                case 3:
                    departmentService.editDepartment();
                    break;
                case 4:
                    departmentService.displayEmployeeInDepartment();
                    break;
                case 5:
                    departmentService.deleteDepartment();
                    break;
                case 6 :
                    return;
                default:
                    System.out.println("Lựa chọn sai, mời nhập lại");
            }
        }
    }

}
