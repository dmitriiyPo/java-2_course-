package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PackedWeightGoodsTest {
    @Test
    void PackedWeightGoodsTest1() {
        ProductPackage a = new ProductPackage();
        ProductPackage b = new ProductPackage("Вещщщ", 1.25);
        WeightGoods f = new WeightGoods("Трава", "Высший сорт");
        WeightGoods ff = new WeightGoods("Штука дрюка", "мироприятие");
        PackedWeightGoods aa = new PackedWeightGoods(ff, 1, a);
        PackedWeightGoods bb = new PackedWeightGoods(f, -3, b);
        assertEquals(a, aa.getProductPackage());
        assertEquals(1, aa.getNetWeight());
        assertEquals("Штука дрюка", aa.getName());
        assertEquals("мироприятие", aa.getDescription());
        assertEquals(b, bb.getProductPackage());
        assertEquals(3, bb.getNetWeight());
        assertEquals("Трава", bb.getName());
        assertEquals("Высший сорт", bb.getDescription());
    }

    @Test
    void getNetWeightTest() {
        PackedWeightGoods bb = new PackedWeightGoods(new WeightGoods("Трава", "Высший сорт"),
                3, new ProductPackage());
        assertEquals(3, bb.getNetWeight());
    }

    @Test
    void getGrossWeightTest() {
        PackedWeightGoods bb = new PackedWeightGoods(new WeightGoods("Трава", "Высший сорт"),
                3, new ProductPackage());
        assertEquals(4, bb.getGrossWeight());
    }
}