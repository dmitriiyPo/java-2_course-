package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualsAndHeshCodeTest
{
    @Test
    void matrixTest() {
        double[] arrT1 = { 1, 6, -9, 999, 8, 12, -4, 0, 0 };
        double[] arrT2 = { 1, 6, -9, 999, 8, 12, -4, 0, 0, 9, 8, 11, 0, 0, 5, 9 };
        Matrix matrix1 = new Matrix(3);
        Matrix matrix2 = new Matrix(4);
        Matrix matrix3 = new Matrix(3);
        for (int i = 0; i < arrT1.length; i++) {
            matrix1.changeElement(i / 3,i % 3,arrT1[i]);
        }
        for (int i = 0; i < arrT2.length; i++) {
            matrix2.changeElement(i / 4,i % 4, arrT2[i]);
        }
        matrix3.changeElement(0, 0, 1);
        matrix3.changeElement(0, 1, 6);
        matrix3.changeElement(0, 2, -9);
        matrix3.changeElement(1, 0, 999);
        matrix3.changeElement(1, 1, 8);
        matrix3.changeElement(1, 2, 12);
        matrix3.changeElement(2, 0, -4);
        matrix3.changeElement(2, 1, 0);
        matrix3.changeElement(2, 2, 0);
        assertEquals(matrix1, matrix3);
        assertNotEquals(matrix1, matrix2);
        assertNotEquals(matrix3, matrix2);
    }
    @Test
    void diagMatrixTest() {
        double[] arrT = { 1, 6, -9, 999, 8, 12, -4, 0, 0 };
        double[] arrT2 = { 1, 6, -9, 999, 8, 12, -4, 0, 0, 9, 8, 11, 0, 0, 5, 9 };
        DiagMatrix diagMatrix1 = new DiagMatrix(9);
        for (int i = 0; i < arrT.length; i++) {
            diagMatrix1.changeElement(i , i, arrT[i]);
        }
        DiagMatrix diagMatrix2 = new DiagMatrix(arrT);
        DiagMatrix diagMatrix3 = new DiagMatrix(arrT2);
        DiagMatrix diagMatrix4 = new DiagMatrix(9);
        diagMatrix4.changeElement(0, 0, 1);
        diagMatrix4.changeElement(1, 1, 6);
        diagMatrix4.changeElement(2, 2, -9);
        diagMatrix4.changeElement(3, 3, 999);
        diagMatrix4.changeElement(4, 4, 8);
        diagMatrix4.changeElement(5, 5, 12);
        diagMatrix4.changeElement(6, 6, -4);
        diagMatrix4.changeElement(7, 7, 0);
        diagMatrix4.changeElement(8, 8, 0);
        assertEquals(diagMatrix1, diagMatrix2);
        assertEquals(diagMatrix1, diagMatrix4);
        assertEquals(diagMatrix2, diagMatrix4);
        assertNotEquals(diagMatrix1, diagMatrix3);
        assertNotEquals(diagMatrix2, diagMatrix3);
    }
    @Test
    void upTriangleMatrixTest() {
        double[] arrT = { 1, 6, -9, 0, 8, 12, 0, 0, 666 };
        double[] arrT2 = { 1, 6, 0, 999 };
        UpTriangleMatrix upTriangleMatrix1 = new UpTriangleMatrix(3);
        UpTriangleMatrix upTriangleMatrix2 = new UpTriangleMatrix(2);
        UpTriangleMatrix upTriangleMatrix3 = new UpTriangleMatrix(3);
        for (int i = 0; i < arrT.length; i++) {
            upTriangleMatrix1.changeElement(i / 3,i % 3, arrT[i]);
        }
        for (int i = 0; i < arrT2.length; i++) {
            upTriangleMatrix2.changeElement(i / 2,i % 2,arrT2[i]);
        }
        upTriangleMatrix3.changeElement(0, 0, 1);
        upTriangleMatrix3.changeElement(0, 1, 6);
        upTriangleMatrix3.changeElement(0, 2, -9);
        upTriangleMatrix3.changeElement(1, 0, 0);
        upTriangleMatrix3.changeElement(1, 1, 8);
        upTriangleMatrix3.changeElement(1, 2, 12);
        upTriangleMatrix3.changeElement(2, 0, 0);
        upTriangleMatrix3.changeElement(2, 1, 0);
        upTriangleMatrix3.changeElement(2, 2, 666);
        assertEquals(upTriangleMatrix1, upTriangleMatrix3);
        assertNotEquals(upTriangleMatrix1, upTriangleMatrix2);
        assertNotEquals(upTriangleMatrix3, upTriangleMatrix2);
    }
}