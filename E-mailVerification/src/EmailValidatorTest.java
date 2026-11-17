public class EmailValidatorTest {

    public static void main(String[] args) {
        EmailValidator validator = new EmailValidator();

        testValidEmail(validator);
        testInvalidEmail(validator);
    }

    static void testValidEmail(EmailValidator validator) {
        boolean result = validator.isValidEmail("user@example.com");
        if (result) {
            System.out.println("testValidEmail PASSED");
        } else {
            System.out.println("testValidEmail FAILED");
        }
    }

    static void testInvalidEmail(EmailValidator validator) {
        boolean result = validator.isValidEmail("user.example.com");
        if (!result) {
            System.out.println("testInvalidEmail PASSED");
        } else {
            System.out.println("testInvalidEmail FAILED");
        }
    }
}