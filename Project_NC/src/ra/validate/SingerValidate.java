package ra.validate;

public class SingerValidate {
    public static boolean validateInt(int age) {
        if(age > 0) {
            return true;
        }
        return false;
    }
    public static boolean validateString(String string) {
        return string.trim().isEmpty();
    }
}
