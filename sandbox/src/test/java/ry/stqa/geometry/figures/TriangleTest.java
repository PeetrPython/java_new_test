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



}
