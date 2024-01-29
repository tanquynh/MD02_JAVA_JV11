package th2;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Student student1 = new Student("Tuan", 20, "Hn");
        Student student2 = new Student("Manh", 19, "BN");
        Student student3 = new Student("Binh", 21, "Hp");
        Student student4 = new Student("hung", 22, "DN");
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student4);
        System.out.println(studentMap.toString());
        // Duyet theo entrry
        System.out.println("--------------------------------------");
        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.getKey() + " - " + student.getValue().toString());
        }
        //Duyet theo for
        System.out.println("--------------------------------------");
        Set<Integer> studentSet = studentMap.keySet();
        for (Integer i : studentSet) {
            System.out.println("ID : " + i + " - " + studentMap.get(i).toString());
        }
        //Duyet theo Interator
        System.out.println("--------------------------------------");
        Iterator<Integer> integerIterator = studentMap.keySet().iterator();
        while (integerIterator.hasNext()) {
            System.out.println(studentMap.get(integerIterator.next()));
        }

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        System.out.println(students);
    }
}
