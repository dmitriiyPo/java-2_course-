package org.example;

public class DiagMatrix extends UpTriangleMatrix implements IMatrix // диагональная матрица
{
    public DiagMatrix(int n)
    {
        super(n);
    }
    public DiagMatrix(double[] ArrD) {
        super(ArrD.length);
        for (int i = 0; i < ArrD.length; i++) {
            for (int j = 0; j < ArrD.length; j++) {
                if (i == j) {
                    changeElement(i, j,ArrD[i]);
                } else {
                    changeElement(i, j, 0);
                }
            }
        }
    }
    @Override
    public void changeElement(int i, int j, double newElem) {
        if (i != j && newElem != 0) {
            throw new IllegalArgumentException("Элемент (" + i + "," + j + ") нельзя изменить");
        }
        super.changeElement(i, j, newElem);
    }
}