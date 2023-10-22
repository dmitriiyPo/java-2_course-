package org.example;

public class UpTriangleMatrix extends Matrix implements IMatrix { // верхнетреугольная матрица
    public UpTriangleMatrix(int n)
    {
        super(n);
    }
    @Override
    public void changeElement(int i, int j, double newElem) {
        if (i > j && newElem != 0) {
            throw new IllegalArgumentException("Элемент (" + i + "," + j + ") нельзя изменить");
        }
        super.changeElement(i, j, newElem);
    }
    @Override
    public double matrixDeterminant() {
        if (!getFlag()) {
            double d = 1;
            for (int i = 0; i < getN(); i++) {
                d *= getElement(i, i);
            }
            setFlag(true);
            setDet(d);
        }
        return getDet();
    }
}
