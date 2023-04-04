package p11;

import java.util.Stack;

public class BracketValidator {
    public static boolean checkBracket1(String expression) {
        int count = 0;
        for (char c : expression.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
                if (count < 0) return false;
            }
        }
        return count == 0;
    }

    public static boolean checkBracket2(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.empty()) return false;
                if ((c == ')' && stack.peek() == '(') ||
                    (c == ']' && stack.peek() == '[') ||
                    (c == '}' && stack.peek() == '{')) {stack.pop();}
                else return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String expression = "{([{{([{}()[]])}}({([{{([{{([{{([{}()[]])}}({([{{([{}()[]])}}()[]])})[{([{{([{}()[]])}}({([{{([{}()[]])}}()[]])})[]])}]])}}()[]])}}()[]])})[{([{{([{}()[]])}}({([{{([{}()[]])}}()[]])})[{([{{([{}()[]])}}({([{{([{}()[]])}}()[]])})[{([{{([{}()[]])}}({([{{([{}()[]])}}()[]])})[]])}]])}]])}]])}";
        System.out.println(checkBracket1(expression));
        System.out.println(checkBracket2(expression));
        System.out.println(checkBracket2("a*(b+c)"));
        System.out.println(checkBracket1("a*(b+c)"));
        System.out.println(checkBracket2("((a+b)*c)-(d/e)"));
        System.out.println(checkBracket1("((a+b)*c)-(d/e)"));
        checkBracket1("{}");
    }
}
