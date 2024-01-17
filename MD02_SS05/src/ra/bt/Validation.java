package ra.bt;

import java.util.regex.Pattern;

public class Validation {
    //
    public static boolean validateEmail(String email) {
    return Pattern.matches("^[a-zA-Z0-9+_.-]+@gmail\\.com", email);
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
    return Pattern.matches("^(\\+84|0)(3[2-9]|5[689]|7[06789]|8[1-9]|9[0-9])[0-9]{7}$", phoneNumber);
    }
    public static boolean validatePassword(String password){
//        Ensure string has one uppercase, one special case, one digit, one lowercase letter and at least 10 characters long
    return Pattern.matches("^(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])(?=.*[a-z]).{10,}$", password);
    }
    public static boolean validateDateFormat(String date){
    return Pattern.matches("^(0[1-9]|1[012])/(0[1-9]|[12][0-9]|3[01])/\\d{4}$", date);
    }
    public static boolean isNumberInput(String number){
        return Pattern.matches("[0-9]+", number);
    }
}
