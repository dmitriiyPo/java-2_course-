package org.example;
import java.util.Arrays;

public class Utils {
    public static double getProductWeight(PackagedProduct... products)
    {
        return Arrays.stream(products).mapToDouble(PackagedProduct::getGrossWeight).sum();
        //map берет по очереди каждый эл-т из нашего стрима и сопостовляет ему эл-т который
        //из него получается после применения на нем тех действий который мы описываем внутри map
        //получает на вход некоторое кол-во упакованных товаров и считает сумму их массы брутто(типо for each)
    }
}
