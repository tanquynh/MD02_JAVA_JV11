package ra.th1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] inValidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email: validEmail){
            boolean isValid = emailExample.validate(email);
            System.out.println("Email " + email + " is valid: " +  isValid);
        }
        for (String email: inValidEmail){
            boolean isValid = emailExample.validate(email);
            System.out.println("Email " + email + " is valid: " +  isValid);
        }

    }
}
class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
