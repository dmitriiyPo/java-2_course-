package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {
    @Test
    void countByFilter() {
        PackedWeightGoods a1 = new PackedWeightGoods(new WeightGoods("Штука дрюка", "мироприятие"),
                1, new ProductPackage());
        PackedWeightGoods b1 = new PackedWeightGoods(new WeightGoods("Трава", "Высший сорт"),
                -3, new ProductPackage("Вещщщ", 1.25));
        PackedPieceGoods a2 = new PackedPieceGoods(new PieceGoods("Штука дрюка", "мироприятие", 1),
                1, new ProductPackage());
        PackedPieceGoods b2 = new PackedPieceGoods(new PieceGoods("Трава", "Высший сорт", 6),
                3, new ProductPackage("Вещщщ", 1.25));
        ConsignmentOfGoods p = new ConsignmentOfGoods("Хлам", a1, b1, a2, b2);
        assertEquals(2, ProductService.countByFilter(p, new BeginStringFilter("Тр")));
        assertEquals(0, ProductService.countByFilter(p, new BeginStringFilter("idj")));
    }
}