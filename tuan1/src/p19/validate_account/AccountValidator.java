package p19.validate_account;

import java.util.regex.Pattern;

public class AccountValidator {
    public static final Pattern ACCOUNT_REGEX = Pattern.compile("^[_a-z0-9]{6,}$");

    public boolean isValid(String account) {
        return ACCOUNT_REGEX.matcher(account).matches();
    }
}
