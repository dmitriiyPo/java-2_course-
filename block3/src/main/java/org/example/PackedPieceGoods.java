package org.example;

public class PackedPieceGoods extends PieceGoods implements PackagedProduct // 1.6 упакованый штучный товар
{
    private ProductPackage productPackage;
    private int pieceGoods;

    public PackedPieceGoods(PieceGoods product, int k, ProductPackage productPackage)
    {
        super(product.getName(), product.getDescription(), product.getWeight());
        setProductPackage(productPackage);
        setPieceGoods(k);
    }

    public ProductPackage getProductPackage() {
        return productPackage;
    }

    public void setProductPackage(ProductPackage productPackage) {
        this.productPackage = productPackage;
    }

    @Override
    public double getNetWeight() {
        return pieceGoods * getWeight();
    }

    @Override
    public double getGrossWeight() {
        return pieceGoods * getWeight() + productPackage.getWeight();
    }

    public int getPieceGoods() {
        return pieceGoods;
    }

    public void setPieceGoods(int pieceGoods) {
        if (pieceGoods < 0) {
            this.pieceGoods = -1 * pieceGoods;
        } else {
            this.pieceGoods = pieceGoods;
        }
    }

    @Override
    public String getNameP() {
        return getName();
    }
}
