package p11;

import java.util.Stack;

public class BracketValidator {
    public static boolean checkBracket1(String expression) {
        int count = 0;
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if ( ch == '(' ) {
                count++;
            } else if ( ch == ')' ) {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }

    public static boolean checkBracket2(String expression) {

        Stack<Character> stack = new Stack<>();

        for(Character c : expression.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }

                Character top = stack.peek();
                if((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "{([{{([{}()[]])}}({([{{([{{([{{([{}()[]])}}({([{{([{}()[]])}}()[]])})[{([{{([{}()[]])}}({([{{([{}()[]])}}()[]])})[]])}]])}}()[]])}}()[]])})[{([{{([{}()[]])}}({([{{([{}()[]])}}()[]])})[{([{{([{}()[]])}}({([{{([{}()[]])}}()[]])})[{([{{([{}()[]])}}({([{{([{}()[]])}}()[]])})[]])}]])}]])}]])}";
        System.out.println(checkBracket1(expression));
        System.out.println(checkBracket2(expression));
    }
}
