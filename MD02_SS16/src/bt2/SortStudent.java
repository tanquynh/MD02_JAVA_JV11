package bt2;

import java.util.Comparator;

public class SortStudent {

    public static  void insertionSort(Student[] students, Comparator<Student> comparator) {
        int holePosition;
        Student valueInsertSort;
        if (students.length == 0) {
            System.err.println("Chua co hoc sinh");
        } else {
            for (int i = 0; i < students.length; i++) {
                holePosition = i;
                valueInsertSort = students[i];
                while (holePosition > 0 && comparator.compare(students[holePosition - 1], valueInsertSort) > 0) {
                    students[holePosition] = students[holePosition - 1];
                    holePosition = holePosition - 1;
                }
                students[holePosition] = valueInsertSort;
            }
        }
    }

    public static void selectionSort(Student[] students, Comparator<Student> comparator) {
        for (int i = 0; i < students.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < students.length; j++) {
                if(comparator.compare(students[j],students[j+1]) <0) {
                    minIndex = j;
                }
            }
            if(minIndex !=i) {
                Student student;
                student = students[minIndex];
                students[minIndex] = students[i];
                students[i] = student;
            }
        }
    }

    public static void bubbleSort(Student[] students,Comparator<Student> comparator) {
        boolean nextPass = true;
        for (int i = 1; i < students.length && nextPass; i++) {
            nextPass = false;
            for (int j = 0; j < students.length -i; j++) {
                if(comparator.compare(students[j],students[j+1]) <0) {
                    Student student;
                    student = students[j+1];
                    students[j+1] = students[j];
                    students[j] =student;
                    nextPass = true;
                }
            }
        }
    }


}
