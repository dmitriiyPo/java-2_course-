package org.example;
import java.util.Arrays;

public class ProductService {
    public static int countByFilter(ConsignmentOfGoods batch, Filter strFilter) {
        int k = 0;
        PackagedProduct[] arr = batch.products();
        for (PackagedProduct packagedProduct : arr) {
            if (strFilter.apply(packagedProduct.getNameP())) {
                k++;
            }
        }
        return k;
    }
}
