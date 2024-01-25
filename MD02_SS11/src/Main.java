import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};

        // Sao chép mảng nguồn vào mảng đích
        System.arraycopy(sourceArray, 2, sourceArray, 3, sourceArray.length-2);
        sourceArray[2] = 10;
        // In mảng đích sau khi sao chép
        for (int num : sourceArray) {
            System.out.print(num + " ");
        }

    }
}