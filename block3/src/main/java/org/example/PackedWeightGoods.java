package org.example;

public class PackedWeightGoods extends WeightGoods implements PackagedProduct { // 1.5 упакованный весовой товар
    private ProductPackage productPackage;
    private double weightGoods;

    public PackedWeightGoods(WeightGoods product, double massProduct, ProductPackage productPackage)
    {
        super(product.getName(), product.getDescription());
        setProductPackage(productPackage);
        setWeightGoods(massProduct);
    }

    @Override
    public double getNetWeight() {
        return weightGoods;
    }

    @Override
    public double getGrossWeight() {
        return weightGoods + productPackage.getWeight();
    }

    public ProductPackage getProductPackage() {
        return productPackage;
    }

    public void setProductPackage(ProductPackage productPackage) {
        this.productPackage = productPackage;
    }

    public void setWeightGoods(double weightGoods) {
        if (weightGoods < 0) {
            this.weightGoods = -1 * weightGoods;
        } else {
            this.weightGoods = weightGoods;
        }
    }

    @Override
    public String getNameP() {
        return getName();
    }
}
