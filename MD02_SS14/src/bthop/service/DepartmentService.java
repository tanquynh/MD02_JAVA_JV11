package bthop.service;

import bthop.config.InputMethod;
import bthop.constant.Constant;
import bthop.model.Department;

import bthop.repository.FileRepo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DepartmentService implements IService<Department, String> {
    FileRepo<Department, String> departmentFileRepo;


    public DepartmentService() {
        this.departmentFileRepo = new FileRepo<>(Constant.FilePath.DEPARTMENT_PATH);

    }

    @Override
    public List<Department> findAll() {
        return departmentFileRepo.findAll();
    }

    @Override
    public void save(Department department) {
        List<Department> list = findAll();
        Optional<Department> optional = list.stream().filter(item -> item.getDepartmentId().equals(department.getDepartmentId())).findFirst();
        if (optional.isPresent()) {
            int index = list.indexOf(optional.get());
            list.set(index, department);
        } else {
            list.add(department);
        }
        departmentFileRepo.saveToFile(list);;
    }

    @Override
    public Department findById(String id) {
        List<Department> list = findAll();
        Optional<Department> optional = list.stream().filter(item->item.getDepartmentId().equals(id)).findFirst();
        return   optional.orElse(null);
    }

    @Override
    public void delete(String id) {
        List<Department> list = findAll();
        list = list.stream().filter(item -> !item.getDepartmentId().equals(id)).collect(Collectors.toList());
        departmentFileRepo.saveToFile(list);;
    };
    public String autoId() {
        List<Department> list = findAll();
        String maxId = list.isEmpty() ? "000" : list.get(list.size() - 1).getDepartmentId();
        int nextId = Integer.parseInt(maxId.substring(1)) + 1;
        return "D" + String.format("%03d", nextId);
    }

    public void displayDepartment() {
        List<Department> departmentList = findAll();
        if (!departmentList.isEmpty()) {
            System.out.println("Danh sách phòng ban");
            departmentList.forEach(Department::displayDepartment);
        } else {
            System.err.println("Danh sách phòng ban rỗng");
        }
    }

    public void addDepartment() {
        List<Department> departmentList = findAll();
        Department department = new Department();
        System.out.println("Nhap so luong phong ban them mới");
        int numberOfDe = InputMethod.getInteger();
        for (int i = 0; i < numberOfDe; i++) {
            System.out.println("Phòng ban thứ " + (i + 1));
            while (true) {
                department.setDepartmentId(autoId());
                System.out.println("Nhap ten phòng ban");
                String input = InputMethod.getString();
                Optional<Department> optional = departmentList.stream().filter(item -> item.getDepartmentName().equals(input)).findFirst();
                if (optional.isPresent()) {
                    System.out.println("Ten phòng ban đã tồn tại, mời nhập lại");
                } else {
                    department.setDepartmentName(input);
                    break;
                }
            }
           department.setTotalMembers(0);
            save(department);
        }
        System.out.println("Tạo phòng ban thành công");
    }

    public void editDepartment() {
        System.out.println("Nhập id phonng ban cần sua");
        List<Department> departmentList = findAll();
        String id = InputMethod.getString();
        Department departmentEdit = findById(id);
        if (departmentEdit != null) {
            departmentEdit.setDepartmentId(id);
            while (true) {
                System.out.println("Nhập vào tên phòng ban mới (Enter để bỏ qua):");
                String newName = InputMethod.scanner().nextLine();
                if (!newName.trim().isEmpty()) {
                    String input = InputMethod.getString();
                    Optional<Department> optional = departmentList.stream().filter(item -> item.getDepartmentName().equals(input)).findFirst();
                    if (optional.isPresent()) {
                        System.out.println("Ten phòng ban đã tồn tại, mời nhập lại");
                    } else {
                        departmentEdit.setDepartmentName(input);
                        break;
                    }
                }
            }
        save(departmentEdit);
        } else {
            System.err.println("Không tìm thấy mã phòng ban cần sửa cần sửa !!!");
        }
    }

    public void displayEmployeeInDepartment() {
        List<Department> departmentList = findAll();
        for (Department department : departmentList) {
            department.displayEmployeeInDepartment();
        }
    }

    public void deleteDepartment() {
        System.out.println("Nhập id phòng cần xóa");
        String idDelete = InputMethod.getString();
        Department department = findById(idDelete);
        if(department.getTotalMembers() != 0) {
            System.err.println("Nhân viên đang có không được xóa phòng");
        }
        else  {
            delete(idDelete);
        }
    }
}
