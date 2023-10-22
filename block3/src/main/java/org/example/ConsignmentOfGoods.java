package org.example;

public record ConsignmentOfGoods(String description, PackagedProduct... products) // 1.8 Партия товаров
{

    public double getWeight() {
        return Utils.getProductWeight(products);
    }
}
