package bthop.service;

import bthop.config.InputMethod;
import bthop.constant.Constant;
import bthop.model.Department;
import bthop.model.Employee;
import bthop.repository.FileRepo;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeService implements IService<Employee,String>{
    DepartmentService departmentService = new DepartmentService();
    FileRepo<Employee,String> employeeFileRepo;
    public EmployeeService() {
        this.employeeFileRepo = new FileRepo<>(Constant.FilePath.EMPLOYEE_PATH);
    }


    @Override
    public List<Employee> findAll() {
        return employeeFileRepo.findAll();
    }

    @Override
    public void save(Employee employee) {
        List<Employee> list = findAll();
        Optional<Employee> optional = list.stream().filter(item -> item.getEmployeeId().equals(employee.getEmployeeId())).findFirst();
        if (optional.isPresent()) {
            int index = list.indexOf(optional.get());
            list.set(index, employee);
        } else {
            list.add(employee);
        }
        employeeFileRepo.saveToFile(list);
    }

    @Override
    public Employee findById(String id) {
        List<Employee> list = findAll();
        Optional<Employee> optional = list.stream().filter(item->item.getEmployeeId().equals(id)).findFirst();
        return   optional.orElse(null);
    }

    @Override
    public void delete(String id) {
        List<Employee> list = findAll();
        list = list.stream().filter(item -> !item.getEmployeeId().equals(id)).collect(Collectors.toList());
        employeeFileRepo.saveToFile(list);
    }
    public String autoId() {
        List<Employee> list = findAll();
        String maxId = list.isEmpty() ? "0001" : list.get(list.size() - 1).getEmployeeId();
        int nextId = Integer.parseInt(maxId.substring(1)) + 1;
        return "E" + String.format("%04d", nextId);
    }

    public void displayEmployeeInfor() {
        List<Employee> employeeList = findAll();
        if (!employeeList.isEmpty()) {
            System.out.println("Danh sách nhân vien");
            employeeList.forEach(Employee::displayEmployeeInforName);
        } else {
            System.err.println("Danh sách nhân viên rỗng");
        }
    }

    public void displayEmployee() {
        List<Employee> employeeList = findAll();
        if (!employeeList.isEmpty()) {
            System.out.println("Danh sách nhân vien");
            employeeList.forEach(Employee::displayEmployee);
        } else {
            System.err.println("Danh sách nhân viên rỗng");
        }

    }

    public void addEmployee() {

    }

    public void deleteEmployee() {
        System.out.println("Nhập id nhân viên cần xóa");
        String idDelete = InputMethod.getString();
        delete(idDelete);
    }

    public void editEmployee() {
    }

    public void averageEmployeesPerDepartment() {
         double avg = departmentService.findAll().stream()
                .collect(Collectors.averagingInt(Department::getTotalMembers));
        System.out.println("So nhân viên trung bình : " + avg);
    }

    public void top5DepartmentsByEmployeeCount() {
        List<Department> departmentList = departmentService.findAll().stream()
                .sorted(Comparator.comparingInt(department -> -department.getTotalMembers()))
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Danh sách 5 phòng nhiều nhân viên nhất");
        departmentList.forEach(Department::displayDepartment);
    }

    public void managerWithMostEmployees() {
        findAll().stream()
                .filter(employee -> employee.getManager() != null)
                .collect(Collectors.groupingBy(Employee::getManager, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }


    public void top5OldestEmployees() {
        List<Employee> employeeList = findAll().stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Danh sach 5 nguoi thu nhập cao nhat");
        employeeList.forEach(Employee::displayEmployee);
    }

    public void top5HighestPaidEmployees() {
        List<Employee> employeeList =findAll().stream()
                .sorted(Comparator.comparing(Employee::getBirthday).reversed())
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Danh sach 5 nguoi lon tuoi nhat");
        employeeList.forEach(Employee::displayEmployee);
    }
}
