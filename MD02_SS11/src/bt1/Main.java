package bt1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i, (int) Math.ceil(Math.random() * 10));
        }
        System.out.println(list);
        // Cách 1 : Dùng for bình thường
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);

            }
        }
        System.out.println(max);
        // Dunng ArrayList , sau dung Collections.sort sắp xếp
        ArrayList<Integer> arrayList = new ArrayList<>(list);
        Collections.sort(arrayList);
        System.out.println("array list sort" + arrayList);
        System.out.println("max " +arrayList.get(arrayList.size()-1));

        // Cach 3 : Dùng treeSet loại bỏ số trùng lặp, tự động sắp xếp theo chiều tăng dần,
        TreeSet<Integer> treeSet = new TreeSet<>(list);
        System.out.println("treeSet :" + treeSet);
        System.out.println("Max :" + treeSet.last());
    }
}
