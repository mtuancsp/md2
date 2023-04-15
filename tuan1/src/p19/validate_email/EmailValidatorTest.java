package p19.validate_email;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailValidatorTest {
    private final EmailValidator emailValidator = new EmailValidator();

    @Test
    public void testValidEmail() {
        assertTrue(emailValidator.isValid("johndoe2@example.com"));
        assertTrue(emailValidator.isValid("janedoe123@example.co"));
        assertTrue(emailValidator.isValid("jacksmith1234@example.net"));
    }

    @Test
    public void testInvalidEmail() {
        assertFalse(emailValidator.isValid("john.doe@.com"));
        assertFalse(emailValidator.isValid("jane.doe@example."));
        assertFalse(emailValidator.isValid("jack.smith@examplecom"));
    }
}
