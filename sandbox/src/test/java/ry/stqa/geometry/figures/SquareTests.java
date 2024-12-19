package ry.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

    @Test
    void canCalculateArea() {
        var result = Square.squareArea(4.0);
        Assertions.assertEquals(25.0, result);
    }

    @Test
    void canCalculatePerimetr(){
        Assertions.assertEquals(20.0, Square.perimeter(5.0));
    }
}
