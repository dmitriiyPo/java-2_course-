package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PackedPieceGoodsTest {
    @Test
    void PackedPieceGoodsTest1() {
        ProductPackage a = new ProductPackage();
        ProductPackage b = new ProductPackage("Вещщщ", 1.25);
        PieceGoods f = new PieceGoods("Трава", "Высший сорт", 6);
        PieceGoods ff = new PieceGoods("Штука дрюка", "мироприятие", 1);
        PackedPieceGoods aa = new PackedPieceGoods(ff, 1, a);
        PackedPieceGoods bb = new PackedPieceGoods(f, 3, b);
        assertEquals(a, aa.getProductPackage());
        assertEquals(1, aa.getPieceGoods());
        assertEquals("Штука дрюка", aa.getName());
        assertEquals("мироприятие", aa.getDescription());
        assertEquals(b, bb.getProductPackage());
        assertEquals(3, bb.getPieceGoods());
        assertEquals("Трава", bb.getName());
        assertEquals("Высший сорт", bb.getDescription());
    }

    @Test
    void getNetWeightTest() {
        PackedPieceGoods a = new PackedPieceGoods(new PieceGoods("Трава", "Высший сорт", 6),
                6, new ProductPackage());
        assertEquals(36 , a.getNetWeight());
    }

    @Test
    void GrossWeightTest() {
        PackedPieceGoods a = new PackedPieceGoods(new PieceGoods("Трава", "Высший сорт", 6),
                6, new ProductPackage());
        assertEquals(37 , a.getGrossWeight());
    }
}