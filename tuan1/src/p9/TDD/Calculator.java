package p9.TDD;

public class Calculator {
    public int add(int firstOperand, int secondOperand) {
        long result = (long) firstOperand + secondOperand;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new RuntimeException("out of range exception");
        }
        return (int) result;
    }

}
