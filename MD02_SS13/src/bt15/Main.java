package bt15;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(4,"Manh");
        treeMap.put(1,"Tuan");
        treeMap.put(5,"Hai");
        treeMap.put(3,"hung");
        treeMap.put(2,"Linh");
        System.out.println("Danh sach  ban dau");
        System.out.println(treeMap);
        treeMap.remove(4);
        System.out.println("Danh sach sau khi xoa vi tri 4");
        System.out.println(treeMap);
    }

}
