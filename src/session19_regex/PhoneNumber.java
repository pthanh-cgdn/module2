package session19_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;
    String phoneNumber;
    private final String PHONE_REGEX = "\\(\\d{2}\\)-\\(0\\d{9}\\)";
    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        pattern = Pattern.compile(PHONE_REGEX);
    }
    public boolean validate(){
        matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber("(84)-(9978489648)");
        System.out.println(phoneNumber.validate());
    }
}
