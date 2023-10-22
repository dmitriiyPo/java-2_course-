package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeterminantTest
{
    @Test
    void matrixTest()
    {
        double[] arrT1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Matrix matrix1 = new Matrix(3);
        for (int i = 0; i < arrT1.length; i++) {
            matrix1.changeElement(i / 3,i % 3, arrT1[i]);
        }
        assertEquals(0, -matrix1.matrixDeterminant());
        double[] arrT2 = { 1, 2, 3, 0, 0, 0, 7, 8, 9 };
        Matrix matrix2 = new Matrix(3);
        for (int i = 0; i < arrT2.length; i++) {
            matrix2.changeElement(i / 3,i % 3, arrT2[i]);
        }
        assertEquals(0, matrix2.matrixDeterminant());
        double[] arrT3 = { 1, 2, 3, 0, 1, 6, 0, 0, 9 };
        Matrix matrix3 = new Matrix(3);
        for (int i = 0; i < arrT3.length; i++) {
            matrix3.changeElement(i / 3,i % 3, arrT3[i]);
        }
        assertEquals(9, matrix3.matrixDeterminant());
        Matrix matrix5 = new Matrix(1);
        matrix5.changeElement(0, 0, 5);
        assertEquals(5, matrix5.matrixDeterminant());

        double[] arrT6 = { 1, 2, 3, 2, 4, 6, 3, 6, 9 };
        Matrix matrix6 = new Matrix(3);
        for (int i = 0; i < arrT6.length; i++) {
            matrix6.changeElement(i / 3,i % 3, arrT6[i]);
        }
        assertEquals(0, matrix6.matrixDeterminant(), 1e-9);

    }
    @Test
    void diagMatrixTest() {
        double[] arrT1 = { 1, 6, -9, 1, 8, 12, -4, 6, 8 };
        double[] arrT2 = { 1, 6, -9, 999, 8, 12, -4, 0, 0, 9, 8, 11, 0, 0, 5, 9 };
        DiagMatrix diagMatrix1 = new DiagMatrix(arrT1);
        DiagMatrix diagMatrix2 = new DiagMatrix(arrT2);
        assertEquals(995328, diagMatrix1.matrixDeterminant());
        assertEquals(0, diagMatrix2.matrixDeterminant());
    }
    @Test
    void upTriangleMatrixTest() {
        double[] arrT1 = { 1, 6, -9, 0, 8, 12, 0, 0, 3 };
        double[] arrT2 = { 1, 6, 0, 999 };
        double[] arrT3 = { 0, 6, 0, 999 };
        UpTriangleMatrix upTriangleMatrix1 = new UpTriangleMatrix(3);
        UpTriangleMatrix upTriangleMatrix2 = new UpTriangleMatrix(2);
        UpTriangleMatrix upTriangleMatrix3 = new UpTriangleMatrix(2);
        for (int i = 0; i < arrT1.length; i++) {
            upTriangleMatrix1.changeElement(i / 3,i % 3, arrT1[i]);
        }
        for (int i = 0; i < arrT2.length; i++) {
            upTriangleMatrix2.changeElement(i / 2,i % 2,arrT2[i]);
        }
        for (int i = 0; i < arrT3.length; i++) {
            upTriangleMatrix3.changeElement(i / 2,i % 2,arrT3[i]);
        }
        assertEquals(24, upTriangleMatrix1.matrixDeterminant());
        assertEquals(999, upTriangleMatrix2.matrixDeterminant());
        assertEquals(0, upTriangleMatrix3.matrixDeterminant());
    }
    @Test
    void matrixTest10() {
        double[] arrT10 = {1, 0, 0, 0, 0, 1, 0, 1, 0};
        Matrix matrix1 = new Matrix(3);
        for (int i = 0; i < arrT10.length; i++) {
            matrix1.changeElement(i / 3, i % 3, arrT10[i]);
        }
        assertEquals(-1, matrix1.matrixDeterminant(), 1e-9);
    }

}