package p9.triangle_classifier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {

    @Test
    public void testTriangleClassifier1() {
        int a = 3;
        int b = 4;
        int c = 5;

        String expected = "Right triangle";
        var triangle = new TriangleClassifier(a, b, c);
        String result = triangle.classifyTriangle();

        assertEquals(expected, result);
    }

    @Test
    public void testTriangleClassifier2() {
        int a = 4;
        int b = 5;
        int c = 6;

        String expected = "Acute triangle";
        var triangle = new TriangleClassifier(a, b, c);
        String result = triangle.classifyTriangle();

        assertEquals(expected, result);
    }

    @Test
    public void testTriangleClassifier3() {
        int a = 5;
        int b = 5;
        int c = 5;

        String expected = "Equilateral triangle";
        var triangle = new TriangleClassifier(a, b, c);
        String result = triangle.classifyTriangle();

        assertEquals(expected, result);
    }

    @Test
    public void testTriangleClassifier4() {
        int a = 1;
        int b = 4;
        int c = 6;

        String expected = "Not a triangle";
        var triangle = new TriangleClassifier(a, b, c);
        String result = triangle.classifyTriangle();

        assertEquals(expected, result);
    }
    @Test
    public void testTriangleClassifier5() {
        int a = -1;
        int b = 4;
        int c = 6;

        String expected = "Not a triangle";
        var triangle = new TriangleClassifier(a, b, c);
        String result = triangle.classifyTriangle();

        assertEquals(expected, result);
    }

    @Test
    public void testTriangleClassifier6() {
        int a = 4;
        int b = 4;
        int c = 6;

        String expected = "Isosceles triangle";
        var triangle = new TriangleClassifier(a, b, c);
        String result = triangle.classifyTriangle();

        assertEquals(expected, result);
    }
}
