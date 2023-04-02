package p11.my_generic_stack;
public class GenericStackClient {

    static void stackOfString(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operation: " + stack.size());
        System.out.print("1.2 Pop element form stack: ");
        while (!stack.isEmpty()) {
            System.out.printf("%s ", stack.pop());
        }
        System.out.println("\n1.3 Size of stack after pop operation: " + stack.size());
    }

    static void stackOfInteger(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 Size of stack after push operation: " + stack.size());
        System.out.print("2.2 Pop element form stack: ");
        while (!stack.isEmpty()) {
            System.out.printf("%d ", stack.pop());
        }
        System.out.println("\n2.3 Size of stack after pop operation: " + stack.size());
    }

    public static void main(String[] args) {

        System.out.println("1. Stack of String");
        stackOfString();
        System.out.println("2. Stack of Integer");
        stackOfInteger();

    }
}
