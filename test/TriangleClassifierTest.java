import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void checkTriangleSide1() {
        int a = 2;
        int b = 2;
        int c = 2;

        System.out.println(TriangleClassifier.checkTriangleSide(a, b, c));

    }

    @Test
    void checkTriangleSide2() {
        int a = 2;
        int b = 2;
        int c = 3;

        System.out.println(TriangleClassifier.checkTriangleSide(a, b, c));

    }

    @Test
    void checkTriangleSide3() {
        int a = 3;
        int b = 4;
        int c = 5;

        System.out.println(TriangleClassifier.checkTriangleSide(a, b, c));

    }

    @Test
    void checkTriangleSide4() {
        int a = 8;
        int b = 2;
        int c = 3;

        System.out.println(TriangleClassifier.checkTriangleSide(a, b, c));

    }

    @Test
    void checkTriangleSide5() {
        int a = -1;
        int b = 2;
        int c = 1;

        System.out.println(TriangleClassifier.checkTriangleSide(a, b, c));

    }

    @Test
    void checkTriangleSide6() {
        int a = 0;
        int b = 1;
        int c = 1;

        System.out.println(TriangleClassifier.checkTriangleSide(a, b, c));

    }
}