package ra.bt4;

public class Main {
    public static void main(String[] args) {
//        BÀI TẬP
//        Hiển thị 20 số nguyên tố đầu tiên
        System.out.println("20 số nguyên tố đầu tiên bao gồm: ");
        int count = 0, number = 1;
//        Chạy vòng lặp cho đến khi nào đếm đủ 20 số nguyên tố thì dừng lại
        while (count <= 20) {
//            với mỗi số đưa vào kiểm tra, gọi hàm isPrimeNumber để kiểm tra số đó, nếu giá trị trả về là true thì in ra số đó, và tăng count lên 1
//            trong mọi trường hợp, tăng số lên 1
            if (isPrimeNumber(number)){
                System.out.print(number + " ");
                count++;
                number++;
            }
            number++;

        }
    }
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
