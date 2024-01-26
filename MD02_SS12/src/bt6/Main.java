package bt6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(1,"Nguen Manh Hung","Nam","01/06/1994"),
                new Employee(2,"Nguen Thi Hoa","Nu","12/08/1996"),
                new Employee(3,"Nguen My Hanh","Nu","21/06/1997"),
                new Employee(4,"Nguen Manh Hung","Nam","15/03/1999"),
                new Employee(5,"Nguen My Dung","Nu","01/09/1995"),
        };
        Queue<Employee> male = new LinkedList<>();
        Queue<Employee> female = new LinkedList<>();
        Queue<Employee> employeeQueue = new LinkedList<>();
        for (Employee employee : employees) {
            if(employee.getGender().equalsIgnoreCase("Nu")) {
                female.add(employee);
            }else {
                male.add(employee);
            }
        }
        List<Employee> listFemale = new ArrayList<>(female);
        Collections.sort(listFemale,(a,b) ->a.getBirthDay().compareTo(b.getBirthDay()));
        List<Employee> listMale =  new ArrayList<>(male);
        Collections.sort(listMale, (a,b) -> a.getBirthDay().compareTo(b.getBirthDay()));
        employeeQueue.addAll(listFemale);
        employeeQueue.addAll(listMale);
        for (Employee employee : employeeQueue) {
            System.out.println(employee.toString());
        }
    }
}
