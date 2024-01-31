package bthop.run;

import bthop.config.InputMethod;
import bthop.controller.DepartmentController;
import bthop.controller.EmployeeController;

public class CompanyManagement {
    public static void main(String[] args) {
        while (true) {
            System.out.println("-------------------COMPANY-MANAGEMENT----------------");
            System.out.println("1. Quản lý phòng ban \n" +
                    "2. Quản lý nhân viên \n" +
                    "0. Thoát ");
            System.out.println("Nhap lua chon");
            byte choice = InputMethod.getByte();
            switch (choice) {

                case 1:
                    new DepartmentController().displayDepartmentManagement();
                    break;
                case 2:
                    new EmployeeController().displayEmployeeManagement();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không đúng, mời nhập lại");
            }
        }
    }
}
