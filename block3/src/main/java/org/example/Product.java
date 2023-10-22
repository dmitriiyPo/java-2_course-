package org.example;
import java.util.Objects;

public class Product // 1.2 товар
{
    private String name;
    private String description;
    public Product()
    {
        this.name = "Хлам";
        this.description = "Непонятно";
    }
    public Product(String name, String description)
    {
        setName(name);
        setDescription(description);
    }
    @Override
    public String toString()
    {
        return String.format("%s: %s", name, description);
    }
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product that = (Product) o;
        return Objects.equals(name, that.name) && Objects.equals(description, that.description);
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(name, description);
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class PieceGoods extends Product // 1.4 штучный товар
{
    private double weight;

    public PieceGoods()
    {
        super();
        this.weight = 1;
    }

    public PieceGoods(String name, String description, double weight)
    {
        super(name, description);
        setWeight(weight);
    }

    @Override
    public String toString() {
        return String.format("%s(%f кг): %s", getName(), weight, getDescription());
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PieceGoods that = (PieceGoods) o;
        return Double.compare(that.weight, weight) == 0 && Objects.equals(getName(), that.getName()) &&
                Objects.equals(getDescription(), that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
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
}





