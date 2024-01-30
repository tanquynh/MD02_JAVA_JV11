package bt9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = getArr();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap min");
        int min = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap max");
        int max = Integer.parseInt(sc.nextLine());

        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>min && arr[i]<max) {
                treeMap.put(i,arr[i]);
            }
        }
        if(!treeMap.isEmpty()) {
            System.out.println("Danh sach so");
            Set<Integer> setkey = treeMap.keySet();
            for (Integer i : setkey) {
                System.out.println("Vi tri : " + i + " Gia tri " + treeMap.get(i));
            }
        } else {
            System.out.println("Danh sach khong co");
        }

    }

    public static int[] getArr() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*50);
        }
        Arrays.sort(arr);
//        List<Integer> list = Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new));
//       Collections.sort(list);
        return arr;
    }
}
