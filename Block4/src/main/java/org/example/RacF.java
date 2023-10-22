package org.example;

public class RacF implements IOneRealArgumentFunction {
    // Параметры
    private final double A;
    private final double B;
    private final double C;
    private final double D;
    // Границы
    private final double right;
    private final double left;

    public RacF(double A, double B, double C, double D, double right, double left) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        if (left > right) {
            this.right = left;
            this.left = right;
        } else {
            this.right = right;
            this.left = left;
        }
    }
    @Override
    public double getValue(double x) throws IllegalArgumentException {
        if (x > right || x < left) throw new IllegalArgumentException();
        return (A * x + B) / (C * x + D);
    }
    @Override
    public double getRight() {
        return right;
    }
    @Override
    public double getLeft() {
        return left;
    }
}