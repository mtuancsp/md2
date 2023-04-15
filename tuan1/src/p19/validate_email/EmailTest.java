package p19.validate_email;

public class EmailTest {
    public static void main(String[] args) {
        var emailValidator = new EmailValidator();
        String[] validEmail = {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
        String[] invalidEmail = {"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

        for (String email : validEmail) System.out.println("Email is " + email + " is valid: " + emailValidator.isValid(email));
        for (String email : invalidEmail) System.out.println("Email is " + email + " is valid: " + emailValidator.isValid(email));
    }
}
