package p19.validate_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$");

    public boolean isValid(String email) {
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }
}
