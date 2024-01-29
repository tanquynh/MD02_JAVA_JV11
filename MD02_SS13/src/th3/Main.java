package th3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Tuan","HN",19);
        Student student2 = new Student("Manh","DN",21);
        Student student3 = new Student("Anh","HP",20);
        Student student4 = new Student("Hai","QN",27);
        Student student5 = new Student("linh","BN",25);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        Collections.sort(studentList);
        for (Student student : studentList) {
            System.out.println(student.toString());
        }

//        AgeComparator ageComparator = new AgeComparator();
//        studentList.sort(ageComparator);
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() -o2.getAge();
            }
        });

        System.out.println("--------------------------------------");
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }

}
