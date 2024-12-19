package ry.stqa.geometry.figures;

public class Rectangle {
    public static void printRectangleArea(double a, double b) {
        var text = String.format("Площадь прямоугольника со сторонами %.2f и %.2f = %.2f ", a, b, rectangleArea(a, b));
        System.out.println(text);
    }

    public static double rectangleArea(double a, double b) {
        return a * b;
    }
}
