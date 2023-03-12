package PhuongTrinhbac2;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double Discriminant() {
        return b * b - 4 * a * c;
    }

}
