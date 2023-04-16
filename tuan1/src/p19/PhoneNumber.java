package p19;

import java.util.Arrays;

public class PhoneNumber {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "\\d{2}-0\\d{9}";
        return phoneNumber.matches(regex);
    }

    public static void main(String[] args) {
        String[] phoneNumbers = {"12-0123456789", "23-012345678", "45-0987654321", "67-01234567890"};
        Arrays.stream(phoneNumbers).forEach(number -> System.out.println(number + " is " + (isValidPhoneNumber(number) ? "valid" : "invalid")));
    }


}
