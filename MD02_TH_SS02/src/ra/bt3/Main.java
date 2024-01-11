package ra.bt3;

public class Main {
    public static void main(String[] args) {
//        BÀI TẬP
//        Hiển thị các số nguyên tố nhỏ hơn 100
        System.out.println("Danh sách các số nguyên tố trong khoảng từ 2 đến 100:");
        for (int i = 2; i < 100; i++){
            if( isPrimeNumber(i) ) {
                System.out.print(i + " ");
            }
        }
    }
//    Hàm kiểm tra số nguyên tố
//    + nếu số < 2 => không phải là số nguyên tố => true
//    + nếu số = 2 => là số nguyên tố => true
//    + nếu số = 3 => là số nguyên tố => true
//    + nếu số >=4 & chia hết cho 1 số trong khoảng từ 2 đến căn bậc hai của số đó => là hợp số => false
    public static boolean isPrimeNumber(int number){
        if (number < 2) {
            return false;
        } else if (number == 2 || number == 3) {
            return true;
        } else {
            boolean flag = true;
            for(int i = 2; i <= Math.floor(Math.sqrt(number)); i++){
//                chỉ cần có một số là chia hết thì đảo cờ sang false và phá vòng lặp
                if((number % i) == 0){
                    flag = false;
                    break;
                }
            }
            return flag;
        }
    }
}

