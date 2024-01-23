package ra.bt3;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {7, 8, 9, 10, 11, 12};
        int[] c = concatArrays(a, b);
        System.out.println("Mảng sau khi gộp là: ");
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }
    }
    public static int[] concatArrays(int[] a, int[] b){
        int[] c = new int[a.length + b.length];

        for(int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        for(int i = 0; i < b.length; i++){
            c[a.length+i] = b[i];
        }

        return c;
    }
}
