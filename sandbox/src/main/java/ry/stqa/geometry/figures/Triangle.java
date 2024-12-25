package ry.stqa.geometry.figures;

public class Triangle {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    public double area() {
        double p = 0.5 * (this.sideA + this.sideB + this.sideC);
        return Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));


    }

    public double perimeter() {
        double sideP = this.sideA + this.sideB + this.sideC;
        return sideP;
    }
}
