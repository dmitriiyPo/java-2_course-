package org.example;

public class ExpF implements IOneRealArgumentFunction {
    // Параметры
    private final double A;
    private final double B;
    // Границы
    private final double right;
    private final double left;

    public ExpF(double A, double B, double right, double left) {
        this.A = A;
        this.B = B;
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
        return A * Math.exp(x) + B;
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
