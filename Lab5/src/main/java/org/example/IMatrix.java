package org.example;

public interface IMatrix //квадратная матрица вещественных чисел
{
    double getElement(int i, int j); //получить элемент с заданными индексами
    void changeElement(int i, int j, double newElem); //изменить эл-т с заданными индексами
    double matrixDeterminant(); //вычислить определитель матрицы
}
