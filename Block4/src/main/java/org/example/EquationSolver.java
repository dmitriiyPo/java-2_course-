package org.example;

public class EquationSolver { //1.2
    SquareTrinomial equation;
    public EquationSolver(SquareTrinomial equation) {
        this.equation = equation;
    }

    public double SortingRoots() {
        double[] arr = equation.Solution();
        if (arr.length == 1) {
            return arr[0];
        }
        return Math.max(arr[0], arr[1]);
    }
    public SquareTrinomial getEquation() {
        return equation;
    }
    public void setEquation(SquareTrinomial equation) {
        this.equation = equation;
    }
}
