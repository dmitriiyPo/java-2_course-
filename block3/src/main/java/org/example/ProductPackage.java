package org.example;
import java.util.Objects;

public class ProductPackage // 1.1 упаковка
{
    private String name;
    private double weight;

    public ProductPackage()
    {
        this.name = "Лажа";
        this.weight = 1;
    }

    public ProductPackage(String name, double weight)
    {
        setWeight(weight);
        setName(name);
    }

    @Override
    public String toString() {
        return String.format("%s(%f кг)", name, weight);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPackage that = (ProductPackage) o;
        return Objects.equals(name, that.name) && weight == that.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight)
    {
        if (weight < 0)
        {
            this.weight = -1 * weight;
        }
        else
        {
            this.weight = weight;
        }
    }
    public void setName(String name) {
        this.name = name;
    }
}
