package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PieceGoodsTest {
    @Test
    void PieceGoodsTest1() {
        PieceGoods a = new PieceGoods();
        PieceGoods b = new PieceGoods("Дикая мощь тигра", "СпецСредство", 99999);
        assertEquals("Хлам", a.getName());
        assertEquals("Непонятно", a.getDescription());
        assertEquals(1, a.getWeight());
        assertEquals("Дикая мощь тигра", b.getName());
        assertEquals("СпецСредство", b.getDescription());
        assertEquals(99999, b.getWeight());
    }
    @Test
    void testToString() {
        PieceGoods a = new PieceGoods();
        PieceGoods b = new PieceGoods("Дикая мощь тигра", "СпецСредство", 99999999);
        assertEquals("Хлам(1,000000 кг): Непонятно", a.toString());
        assertEquals("Дикая мощь тигра(99999999,000000 кг): СпецСредство", b.toString());
    }
    @Test
    void testEquals() {
        PieceGoods a = new PieceGoods();
        PieceGoods b = new PieceGoods("Дикая мощь тигра", "СпецСредство", 99999999);
        PieceGoods c = new PieceGoods("Дикая мощь тигра", "СпецСредство", 99999999);
        PieceGoods d = new PieceGoods("Мощь тигра", "СпецСредство", 99999999);
        PieceGoods e = new PieceGoods("Дикая мощь тигра", "Спецсредство", 99999999);
        PieceGoods f = new PieceGoods("Дикая мощь тигра", "СпецСредство", 99999);
        assertEquals(b, c);
        assertNotEquals(a, b);
        assertNotEquals(d, b);
        assertNotEquals(e, b);
        assertNotEquals(f, b);
    }
    @Test
    void testHashCode() {
        PieceGoods a = new PieceGoods();
        PieceGoods b = new PieceGoods("Дикая мощь тигра", "СпецСредство", 99999999);
        PieceGoods c = new PieceGoods("Дикая мощь тигра", "СпецСредство", 99999999);
        PieceGoods d = new PieceGoods("Мощь тигра", "СпецСредство", 99999999);
        PieceGoods e = new PieceGoods("Дикая мощь тигра", "Спецсредство", 99999999);
        PieceGoods f = new PieceGoods("Дикая мощь тигра", "СпецСредство", 99999);
        assertEquals(b.hashCode(), c.hashCode());
        assertNotEquals(a.hashCode(), b.hashCode());
        assertNotEquals(d.hashCode(), b.hashCode());
        assertNotEquals(e.hashCode(), b.hashCode());
        assertNotEquals(f.hashCode(), b.hashCode());
    }
}