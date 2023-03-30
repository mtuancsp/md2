package p9.triangle_classifier;

public class TriangleClassifier {
    private final int a;
    private final int b;
    private final int c;

    public TriangleClassifier(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String classifyTriangle() {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Not a triangle";
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            return "Not a triangle";
        } else if (a == b && b == c) {
            return "Equilateral triangle";
        } else if (a == b || b == c || c == a) {
            return "Isosceles triangle";
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return "Right triangle";
        } else if (a * a + b * b > c * c && a * a + c * c > b * b && b * b + c * c > a * a) {
            return "Acute triangle";
        } else {
            return "Obtuse triangle";
        }
    }
}
