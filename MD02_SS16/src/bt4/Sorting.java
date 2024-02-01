package bt4;

import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static <T> void bubbleSort(List<T> list, Comparator<T> comparator) {
        if(list.isEmpty()) {
            System.err.println("Danh sach rong");
        } else {
            boolean nextPass = true;
            for (int i = 1; i < list.size() && nextPass ; i++) {
                nextPass = false;
                for (int j = 0; j < list.size()-i; j++) {
                    if(comparator.compare(list.get(j),list.get(j+1)) <0) {
                        T temp = list.get(j);
                        list.set(j,list.get(j+1)) ;
                        list.set(j+1,temp);
                        nextPass = true;

                    }
                }
            }
        }
    }
    public static <T> void selectionSort(List<T> list, Comparator<T> comparator) {
        if (list.isEmpty()) {
            System.err.println("Danh sach rong");
        } else {
            for (int i = 0; i < list.size(); i++) {
                int maxIndex =i;
                for (int j = i+1; j < list.size(); j++) {
                    if(comparator.compare(list.get(maxIndex), list.get(j)) <0) {
                        T temp = list.get(maxIndex);
                        list.set(maxIndex,list.get(j));
                        list.set(j,temp);
                    }
                }
            }
        }
    }
    
    public static <T> void insertSort(List<T> list, Comparator<T> comparator) {
        if(list.isEmpty()) {
            System.err.println("Danh sach rong");
        } else {
            for (int i = 0; i < list.size(); i++) {
                int holePosition = i;
                T valuePosition = list.get(i);
                while (holePosition>0 && comparator.compare(list.get(holePosition -1),valuePosition) <0) {
                   list.set(holePosition,list.get(holePosition-1));
                    holePosition = holePosition -1;

                }
                list.set(holePosition,valuePosition) ;
            }
        }
    }
}
