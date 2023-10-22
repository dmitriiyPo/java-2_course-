package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ConsignmentOfGoodsTest {
    @Test
    void ConsignmentOfGoodsTest1() {
        PackedWeightGoods a1 = new PackedWeightGoods(new WeightGoods("Штука дрюка", "мироприятие"),
                1, new ProductPackage());
        PackedWeightGoods b1 = new PackedWeightGoods(new WeightGoods("Трава", "Высший сорт"),
                -3, new ProductPackage("Вещщщ", 1.25));
        PackedPieceGoods a2 = new PackedPieceGoods(new PieceGoods("Штука дрюка", "мироприятие", 1),
                1, new ProductPackage());
        PackedPieceGoods b2 = new PackedPieceGoods(new PieceGoods("Трава", "Высший сорт", 6),
                3, new ProductPackage("Вещщщ", 1.25));
        ConsignmentOfGoods p = new ConsignmentOfGoods("Хлам", a1, b1, a2, b2);
        assertEquals("Хлам", p.description());
        assertArrayEquals(new PackagedProduct[] { a1, b1, a2, b2 }, p.products());
        assertEquals(27.5, p.getWeight());
    }

}