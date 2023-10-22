package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeightGoodsTest {
    @Test
    void WeightGoodsTest1() {
        WeightGoods a = new WeightGoods();
        WeightGoods b = new WeightGoods("Трава", "Высший сорт");
        assertEquals("Хлам", a.getName());
        assertEquals("Непонятно", a.getDescription());
        assertEquals("Трава", b.getName());
        assertEquals("Высший сорт", b.getDescription());
    }
    @Test
    void testToString() {
        WeightGoods a = new WeightGoods();
        WeightGoods b = new WeightGoods("Трава", "Высший сорт");
        assertEquals("Хлам: Непонятно", a.toString());
        assertEquals("Трава: Высший сорт", b.toString());
    }
    @Test
    void testEquals() {
        WeightGoods a = new WeightGoods();
        WeightGoods b = new WeightGoods("Трава", "Высший сорт");
        WeightGoods c = new WeightGoods("Трава", "Высший сорт");
        WeightGoods d = new WeightGoods("Трава", "Элитный сорт");
        WeightGoods e = new WeightGoods("Лажа", "Высший сорт");
        assertEquals(b, c);
        assertNotEquals(a, b);
        assertNotEquals(d, b);
        assertNotEquals(e, b);
    }
}