package org.example;

import java.util.Objects;

public class WeightGoods extends Product // 1.3 весовой товар
{
    public WeightGoods() {
        super();
    }

    public WeightGoods(String name, String description) {
        super(name, description);
    }

    @Override
    public String toString() {
        return String.format("%s: %s", getName(), getDescription());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WeightGoods that = (WeightGoods) o;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getDescription(), that.getDescription());
    }
}
