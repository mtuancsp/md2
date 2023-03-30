package p9.fizzbuzz;

public class FizzBuzzTranslate {
    public static String translate(int n) {
        String result = "";
        if (n % 3 == 0 || String.valueOf(n).contains("3")) {
            result += "Fizz";
        }
        if (n % 5 == 0 || String.valueOf(n).contains("5")) {
            result += "Buzz";
        }
        if (result.equals("")) {
            result = readNumber(n);
        }
        return result;
    }

    public static String readNumber(int n) {
        if (n == 0) {
            return "không";
        }

        String[] ones = {"","một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String[] tens = {"","mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};

        if (n < 10) {
            return ones[n];
        }

        ones[5] = "lăm";

        if (n < 20) {
            return "mười " + ones[n-10];
        }

        if (n < 100) {
            int oneDigit = n % 10;
            int tenDigit = (n / 10);
            if (oneDigit == 0) {
                return tens[tenDigit];
            } else {
                return tens[tenDigit] + " " + ones[oneDigit];
            }
        }
        return n + "\nVui lòng nhập n < 100";
    }

}

