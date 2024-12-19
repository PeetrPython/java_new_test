package ry.stqa.geometry.figures;

public class Square {
    public static void printSquareArea(double side) {
        String text= String.format("Площадь квадрата со стороной %.2f = %.2f", side, squareArea(side));
        System.out.println(text);
    }

    public static double squareArea(double a) {
        return a * a;
    }


    public static double perimeter(double a) {
        return 4 * a;
    }
}
