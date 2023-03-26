package org.example;


public class OuterClass {
    private static int outerVariable = 10;

    public static class InnerClass {
        private int innerVariable = 20;

        public void innerMethod() {
            System.out.println("Inner method is called");
            System.out.println("Outer variable is: " + outerVariable);
            System.out.println("Inner variable is: " + innerVariable);
        }
    }

    public static void main(String[] args) {
        InnerClass inner = new InnerClass();
        inner.innerMethod();
    }
}


