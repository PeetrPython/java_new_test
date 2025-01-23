package ry.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    void canCalculateArea() {
        var s = new Triangle(3.0, 4.0, 5.0);
        double result = s.area();
        System.out.println("Площадь t1: " + s.area());
        Assertions.assertEquals(6, result);
    }

    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(12, new Triangle(3.0, 4.0, 5.0).perimeter());
    }

    @Test
    void cannotCreateTriangleWithNegativeSide() {
        try {
            new Triangle(3.0, 4.0, 0.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //ok
        }
    }

    @Test
    void TestPass() {
        var t1 = new Triangle(3.0, 4.0, 5.0);
        var t2 = new Triangle(4.0,5.0, 3.0);
        Assertions.assertTrue(t1.equals(t2));
    }

}
