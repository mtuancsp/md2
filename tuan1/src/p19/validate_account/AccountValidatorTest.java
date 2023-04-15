package p19.validate_account;

public class AccountValidatorTest {
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String args[]) {
        var accountValidator = new AccountValidator();
        for (String account : validAccount) System.out.println("Account is " + account + " is valid: " + accountValidator.isValid(account));
        for (String account : invalidAccount) System.out.println("Account is " + account + " is valid: " + accountValidator.isValid(account));
    }
}
