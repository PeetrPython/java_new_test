package ry.stqa.geometry.figures;

import java.util.Objects;

public class Triangle {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Triangle side should be non-negative");
        }
        if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            throw new IllegalArgumentException("сумма двух любых сторон должна быть не меньше третьей стороны");
        }
    }

    public double area() {
        double p = 0.5 * (this.sideA + this.sideB + this.sideC);
        return Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));


    }

    public double perimeter() {
        double sideP = this.sideA + this.sideB + this.sideC;
        return sideP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (Double.compare(this.sideA, triangle.sideA) == 0 && Double.compare(this.sideB, triangle.sideB) == 0 && Double.compare(this.sideC, triangle.sideC) == 0)
                || (Double.compare(this.sideB, triangle.sideA) == 0 && Double.compare(this.sideC, triangle.sideB) == 0 && Double.compare(this.sideA, triangle.sideC) == 0)
                || (Double.compare(this.sideC, triangle.sideA) == 0 && Double.compare(this.sideA, triangle.sideB) == 0 && Double.compare(this.sideB, triangle.sideC) == 0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC);
    }
}