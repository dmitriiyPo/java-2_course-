package org.example;

import java.util.Arrays;

import static java.lang.Math.sqrt;

public class Matrix implements IMatrix //квадратная матрица произвольного вида
{
   private final double[] arrMatrix;
   private final int n;
   private double det;
   private boolean flag;

    public Matrix(int n)
    {
        if (n < 0)
        {
            throw new IllegalArgumentException("Некорректный размер матрицы");
        }
        this.n = n;
        this.arrMatrix = new double[n * n];
        for (int i = 0; i < n * n; i++)
        {
            arrMatrix[i] = 0;
        }
        det = 0;
        flag = true;
    }

    public int getN()
    {
        return n;
    }

    @Override
    public double getElement(int i, int j)
    {
        if (i < 0 || j < 0 || i >= n || j >= n)
        {
            throw new IllegalArgumentException("Элемента (" + i + "," + j + ") в матрице нет");
        }
        return arrMatrix[i * n + j];
    }

    // 1 2 3   1 2 3 3 4 5 2 2 2
    // 3 4 5   0 1 2 3 4 5 6 7 8
    // 2 2 2

    @Override
    public void changeElement(int i, int j, double newElem)
    {
        if (i < 0 || j < 0 || i >= n || j >= n)
        {
            throw new IllegalArgumentException("Элемента (" + i + "," + j + ") в матрице нет");
        }
        arrMatrix[i * n + j] = newElem;
        flag = false;
    }

    @Override
    public double matrixDeterminant()
    {
        if (flag)                                        // 1 2 3   1 2 3 //2 2 2 1 3 3
        {                                                // 2 2 2   0 1 2 //3 4 5 6 7 8
            return det;                                  // 1 3 3
        }

        flag = true;
        double[] m = new double[n * n];
        System.arraycopy( arrMatrix, 0, m, 0, n * n);
        //double EPSILON = 10e-9;
        int Swaps = 0;

        for (int e = 0; e < n - 1; e++) //приводитматрицу к треугольному виду
        {
            int max = e;
            for (int k = e; k < n; k++)
            {
                if (Math.abs(m[k * n + e]) > Math.abs(m[max * n + e]) /*&& Math.abs(m[k * n + e]) < EPSILON*/)
                {
                    max = k;
                }
            }
            if (max != e) //кол-во перестанвок строк
            {
                swapLines(m, max, e);
                Swaps++;
            }
            if (m[e * n + e] == 0) //на случай если строка нулевая
            {
                det = 0;
                return det;
            }
            for (int i = e + 1; i < n; i++)//вычитаем строки
            {
                double coefficient = m[i * n + e] / m[e * n + e];
                for (int j = 0; j < n; j++)
                {
                    m[i * n + j] -= m[e * n + j] * coefficient;
                }
            }
        }
        det = 1;
        for (int i = 0; i < n; i++) //перемножается диагональ
        {
            det *= m[i * n + i];
        }
        if (Swaps % 2 != 0) //то что мы строки переставляли
        {
            det *= -1;
        }
        return det;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return Arrays.equals(arrMatrix, matrix.arrMatrix);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arrMatrix);
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag)
    {
        this.flag = flag;
    }

    public double getDet() {
        return det;
    }

    public void setDet(double det) {
        this.det = det;
    }

    // приватные вспомогательные функции для нахождения определителя
    private void swapLines(double[] m, int i, int j) // перестановка строк
    {
        for (int k = 0; k < n; k++)
        {
            double tmp = m[i * n + k];
            m[i * n + k] = m[j * n + k];
            m[j * n + k] = tmp;
        }
    }

}
