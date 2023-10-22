package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorTest
{
    @Test
    void matrixTest()
    {
        double[] arrT = { 1, 6, -9, 999, 8, 12, -4, 0, 0 };
        Matrix matrix1 = new Matrix(3);
        for (int i = 0; i < arrT.length; i++)
        {
            matrix1.changeElement(i / 3,i % 3, arrT[i]);
        }
        for (int i = 0; i < arrT.length; i++)
        {
            assertEquals(arrT[i], matrix1.getElement(i / 3,i % 3));
        }
    }
    @Test
    void diagMatrixTest()
    {
        double[] arrT = { 1, 6, -9, 999, 8, 12, -4, 0, 0 };
        DiagMatrix diagMatrix1 = new DiagMatrix(9);
        for (int i = 0; i < arrT.length; i++) {
            diagMatrix1.changeElement(i , i, arrT[i]);
        }
        DiagMatrix diagMatrix2 = new DiagMatrix(arrT);
        for (int i = 0; i < arrT.length * arrT.length; i++) {
            assertEquals(diagMatrix2.getElement(i / 9,i % 9), diagMatrix1.getElement(i / 9,i % 9));
            if (i / 9 != i % 9) {
                assertEquals(0, diagMatrix1.getElement(i / 9,i % 9));
            } else {
                assertEquals(arrT[i / 9], diagMatrix1.getElement(i / 9,i % 9));
            }
        }
    }
    @Test
    void upTriangleMatrixTest() {
        double[] arrT = { 1, 6, -9, 0, 8, 12, 0, 0, 666 };
        UpTriangleMatrix upTriangleMatrix1 = new UpTriangleMatrix(3);
        for (int i = 0; i < arrT.length; i++) {
            upTriangleMatrix1.changeElement(i / 3,i % 3,arrT[i]);
        }
        for (int i = 0; i < arrT.length; i++) {
            assertEquals(arrT[i], upTriangleMatrix1.getElement(i / 3,i % 3));
        }
    }
}