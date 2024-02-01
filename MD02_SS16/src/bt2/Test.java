package bt2;
import java.util.Comparator;

import static java.util.Objects.compare;

public class Test {


    public static void main(String[] args) {
        Student[] studentList = new Student[4];
        studentList[0] = (new Student(1, "Tuan", 6.8));
        studentList[1] = (new Student(2, "Manh", 6.3));
        studentList[2] = (new Student(3, "Hai", 7.5));
        studentList[3] = (new Student(4, "Linh", 8.5));
        Student[] students1 = studentList.clone();
        Student[] students2 = studentList.clone();
        SortStudent.insertionSort(studentList, Comparator.comparingDouble(Student::getScore));
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
        SortStudent.selectionSort(students1,Comparator.comparingDouble(Student::getScore));
        for (Student student : students1) {
            System.out.println(student.toString());
        }
        SortStudent.bubbleSort(students2,Comparator.comparingDouble(Student::getScore));
        for (Student student : students2) {
            System.out.println(student.toString());
        }
    }

}
